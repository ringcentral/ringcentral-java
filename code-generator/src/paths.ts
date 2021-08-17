import fs from 'fs';
import path from 'path';
import {pascalCase, capitalCase, camelCase} from 'change-case';
import R from 'ramda';
import {Operation} from 'ringcentral-open-api-parser/lib/types';

import {capitalizeFirstLetter, escapeJavaDoc, patchSrcFile} from './utils';
import {parsed} from './parser';

const outputDir = '../src/main/java/com/ringcentral/paths';

const generatePathMethod = (
  parameter: string | undefined,
  token: string,
  hasParent: boolean
): string => {
  if (parameter) {
    return `public String path(Boolean withParameter)
        {
            if (withParameter && ${parameter} != null)
            {
                return ${
                  hasParent ? 'parent.path()' : '""'
                } + "/${token}/" + ${parameter};
            }
            return ${hasParent ? 'parent.path()' : '""'} + "/${token}";
        }
        public String path()
        {
          return path(true);
        }`;
  } else {
    return `public String path()
        {
            return ${hasParent ? 'parent.path()' : '""'} + "/${token.replace(
      'dotSearch',
      '.search'
    )}";
        }`;
  }
};

const generateConstructor = (
  parameter: string | undefined,
  defaultValue: string | undefined,
  parentPaths: string[]
): string => {
  const result = ['public RestClient rc;'];
  if (parentPaths.length > 0) {
    result.push(
      `public com.ringcentral.paths.${parentPaths
        .join('.')
        .toLowerCase()}.Index parent;`
    );
  }
  if (parameter) {
    result.push(`public String ${parameter};`);
  }
  if (parentPaths.length > 0) {
    if (defaultValue) {
      result.push(`public Index(com.ringcentral.paths.${parentPaths
        .join('.')
        .toLowerCase()}.Index parent)
      {
        this(parent, "${defaultValue}");
      }`);
    }
    result.push(
      `public Index(com.ringcentral.paths.${parentPaths
        .join('.')
        .toLowerCase()}.Index parent${parameter ? `, String ${parameter}` : ''})
      {`
    );
    result.push('this.parent = parent;');
    result.push('this.rc = parent.rc;');
  } else {
    if (defaultValue) {
      result.push(`public Index(RestClient rc)
      {
        this(rc, "${defaultValue}");
      }`);
    }
    result.push(
      `public Index(RestClient rc${parameter ? `, String ${parameter}` : ''})
      {`
    );
    result.push('this.rc = rc;');
  }
  if (parameter) {
    result.push(`this.${parameter} = ${parameter};`);
  }
  result.push('    }');

  return result.join('\n');
};

const generateOperationMethod = (
  operation: Operation,
  parameter: string | undefined
): string => {
  // comments
  const comments = ['/**'];
  comments.push(
    `${(
      operation.description ||
      operation.summary ||
      capitalCase(operation.operationId)
    )
      .split('\n')
      .map(l => ` * ${escapeJavaDoc(l)}`)
      .join('\n')}`
  );
  comments.push(` * HTTP Method: ${operation.method}`);
  comments.push(` * Endpoint: ${operation.endpoint}`);
  if (operation.rateLimitGroup) {
    comments.push(` * Rate Limit Group: ${operation.rateLimitGroup}`);
  }
  if (operation.appPermission) {
    comments.push(` * App Permission: ${operation.appPermission}`);
  }
  if (operation.userPermission) {
    comments.push(` * User Permission: ${operation.userPermission}`);
  }
  comments.push(' */');
  let result = comments.map(l => `        ${l}`).join('\n');

  // responseType
  let responseType = 'String';
  if (operation.responseSchema) {
    if (
      operation.responseSchema.type === 'string' &&
      operation.responseSchema.format === 'binary'
    ) {
      responseType = 'byte[]';
    } else if (operation.responseSchema.$ref) {
      responseType = operation.responseSchema.$ref;
    }
  }

  // methodParams
  const methodParams: string[] = [];
  if (operation.bodyParameters) {
    methodParams.push(
      `${capitalizeFirstLetter(operation.bodyParameters)} ${
        operation.bodyParameters
      }`
    );
  }
  if (operation.queryParameters) {
    methodParams.push(
      `${capitalizeFirstLetter(operation.queryParameters)} queryParams`
    );
  }

  // requestParams
  const requestParams: string[] = [];
  requestParams.push(
    `this.path(${!operation.withParameter && parameter ? 'false' : ''})`
  );
  if (operation.bodyParameters) {
    requestParams.push(operation.bodyParameters);
  }
  requestParams.push(operation.queryParameters ? 'queryParams' : 'null');
  if (operation.formUrlEncoded) {
    requestParams.push('com.ringcentral.ContentType.FORM');
  }
  if (operation.multipart) {
    requestParams.push('com.ringcentral.ContentType.MULTIPART');
  }

  // result
  result += `
  public ${responseType} ${operation.method2}(${methodParams.join(
    ', '
  )}) throws com.ringcentral.RestException, java.io.IOException
  {\n`;
  if (operation.withParameter) {
    result += `    if (${parameter} == null)
    {
        throw new IllegalArgumentException("Parameter ${parameter} cannot be null");
    }\n`;
  }
  result += `    okhttp3.ResponseBody rb = this.rc.${
    operation.method
  }(${requestParams.join(', ')});`;
  if (responseType === 'String') {
    result += '\n    return rb.string();';
  } else if (responseType === 'byte[]') {
    result += '\n    return rb.bytes();';
  } else {
    result += `\n    return com.ringcentral.Utils.gson.fromJson(rb.string(), ${responseType}.class);`;
  }
  result += '\n    }';

  // overloading
  if (operation.queryParameters) {
    methodParams.pop();
    result += `
    public ${responseType} ${operation.method2}(${methodParams.join(
      ', '
    )}) throws com.ringcentral.RestException, java.io.IOException
    {
      return this.${operation.method2}(${[
      ...methodParams.map(mp => R.last(mp.split(' '))),
      'null',
    ].join(', ')});
    }`;
  }

  return result;
};

for (const item of parsed.paths) {
  const itemPaths = item.paths
    .map(p => {
      if (p === 'default') {
        return 'default1';
      }
      return p;
    })
    .map(p => pascalCase(p));
  const code = `
package com.ringcentral.paths.${itemPaths
    .join('.')
    .replace(/-/g, '')
    .toLowerCase()};

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    ${generateConstructor(
      item.parameter,
      item.defaultParameter,
      R.init(itemPaths)
    )}
    ${generatePathMethod(
      item.parameter,
      R.last(item.paths)!,
      itemPaths.length > 1
    )}
${item.operations
  .map(operation => generateOperationMethod(operation, item.parameter))
  .join('\n\n')}
}
`;
  const folder = path.join(outputDir, ...itemPaths).toLowerCase();
  fs.mkdirSync(folder, {recursive: true});
  fs.writeFileSync(path.join(folder, 'Index.java'), code.trim());

  // bridge methods
  if (item.paths.length > 1) {
    let code = `  public com.ringcentral.paths.${itemPaths
      .join('.')
      .toLowerCase()}.Index ${camelCase(R.last(itemPaths)!)}(${
      item.parameter ? `String ${item.parameter}` : ''
    })
  {
    return new com.ringcentral.paths.${itemPaths
      .join('.')
      .toLowerCase()}.Index(this${item.parameter ? `, ${item.parameter}` : ''});
  }
`;
    if (item.parameter) {
      code = `public com.ringcentral.paths.${itemPaths
        .join('.')
        .toLowerCase()}.Index ${camelCase(R.last(itemPaths)!)}()
    {
      return this.${camelCase(R.last(itemPaths)!)}(${
        item.defaultParameter ? `"${item.defaultParameter}"` : 'null'
      });
    }
${code}`;
    }
    patchSrcFile(
      [
        'paths',
        ...R.init(item.paths).map(item => camelCase(item).toLowerCase()),
        'Index.java',
      ],
      [],
      code
    );
  }
}
