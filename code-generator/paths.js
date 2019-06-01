import yaml from 'js-yaml'
import fs from 'fs'
import * as R from 'ramda'
import changeCase from 'change-case'
import path from 'path'

import { normalizePath, deNormalizePath, getResponseType, appendCodeToFile } from './utils'

const outputDir = '../src/main/java/com/ringcentral/paths'

const doc = yaml.safeLoad(fs.readFileSync('/Users/tyler.liu/src/dotnet/RingCentral.Net/code-generator/rc-platform-adjusted.yml', 'utf8'))

// Delete /restapi/oauth/authorize: https://git.ringcentral.com/platform/api-metadata-specs/issues/26
delete doc.paths['/restapi/oauth/authorize']

const paths = Object.keys(doc.paths)
const normalizedPaths = paths.map(p => normalizePath(p))

const getRoutes = (prefix, name) => {
  return [...prefix.split('/').filter(t => t !== '' && !t.startsWith('{')), name].map(t => changeCase.pascalCase(t))
}
const getFolderPath = (prefix, name) => {
  return path.join(outputDir, ...getRoutes(prefix, name))
}

const generate = (prefix = '/') => {
  const nextLevels = R.pipe(
    R.filter(p => p.startsWith(prefix)),
    R.map(p => p.substring(prefix.length).split('/').filter(t => t !== '')[0]),
    R.filter(t => !R.isNil(t) && !t.startsWith('{')),
    R.uniq
  )(normalizedPaths)
  if (R.isEmpty(nextLevels)) {
    return
  }
  console.log('nextLeves', nextLevels)

  R.forEach(name => {
    console.log('prefix', prefix)
    console.log('name', name)
    const routes = getRoutes(prefix, name)
    console.log('routes', routes)
    const folderPath = getFolderPath(prefix, name)
    console.log('folderPath', folderPath)
    const paramName = R.pipe(
      R.filter(p => p.startsWith(`${prefix}${name}/{`)),
      R.map(p => p.substring(`${prefix}${name}/`.length)),
      R.map(p => p.split('/').filter(t => t !== '')[0]),
      R.map(t => t.substring(1, t.length - 1)),
      R.head
    )(normalizedPaths)
    if (fs.existsSync(folderPath)) {
      console.log('folder already exists')
      generate(`${prefix}${name}/`)
      if (paramName) {
        generate(`${prefix}${name}/{${paramName}}/`)
      }
      return
    }
    fs.mkdirSync(folderPath.toLowerCase())
    if (paramName) {
      console.log('paramName', paramName)
    }
    let defaultParamValue
    if (name === 'restapi' && paramName === 'apiVersion') {
      defaultParamValue = 'v1.0'
    } else if (name === 'scim' && paramName === 'version') {
      defaultParamValue = 'v2'
    } else if (name === 'account' && paramName === 'accountId') {
      defaultParamValue = '~'
    } else if (name === 'extension' && paramName === 'extensionId') {
      defaultParamValue = '~'
    }

    let code = `package com.ringcentral.paths.${routes.join('.').toLowerCase()}\n\n`

    code += `class Index(val ${routes.length > 1 ? `parent: com.ringcentral.paths.${R.init(routes).join('.').toLowerCase()}.Index` : 'rc: com.ringcentral.RestClient'}`
    if (paramName) {
      code += `, val ${paramName}: String? = ${defaultParamValue ? `"${defaultParamValue}"` : null}`
    }
    code += `) {
      ${routes.length > 1 ? 'var rc: com.ringcentral.RestClient = parent.rc' : ''}
    `

    if (paramName) {
      code += `

        fun path(withParameter: Boolean = true): String
        {
            if (withParameter && ${paramName} != null)
            {
                return "${routes.length > 1 ? '$' + '{parent.path()}' : ''}/${name}/` + '$' + `{${paramName}}"
            }

            return ${routes.length > 1 ? '"${parent.path()}' : '"'}/${name}"
        }`
    } else {
      code += `

        fun path(): String
        {
            return ${routes.length > 1 ? '"${parent.path()}' : '"'}/${name.replace('dotSearch', '.search')}"
        }`
    }

    let operations = []
    const endpoints = [deNormalizePath(`${prefix}${name}`)]
    if (paramName) {
      endpoints.push(`${deNormalizePath(`${prefix}${name}`)}/{${paramName}}`)
    }
    endpoints.forEach(endpoint => {
      console.log('endpoint', endpoint)
      const endpointObj = doc.paths[endpoint]
      if (endpointObj) {
        const methods = Object.keys(endpointObj)
        console.log('HTTP methods', methods)
        methods.forEach(method => {
          // remove duplicate DELETE operation
          // it's OK to have duplicate GETs since we have both Get and List
          operations = operations.filter(op => op.method === 'get' || op.method !== method)
          operations.push({
            endpoint,
            method,
            detail: endpointObj[method]
          })
        })
      }
    })

    operations.forEach(operation => {
      const method = changeCase.pascalCase(operation.method)
      const smartMethod = (operation.method === 'get' && !operation.endpoint.endsWith('}') &&
        R.any(o => o.method === 'get' && o.endpoint === operation.endpoint + `/{${paramName}}`)(operations)) ? 'List' : method
      const responses = operation.detail.responses
      let responseType = getResponseType(responses)
      if (!responseType) {
        responseType = 'String'
      }

      let body, bodyClass, bodyParam, formUrlEncoded, multipart
      if (operation.detail.consumes && operation.detail.consumes[0] === 'application/x-www-form-urlencoded') {
        formUrlEncoded = true
      } else if (operation.detail.consumes && operation.detail.consumes[0].startsWith('multipart/')) {
        multipart = true
      } else if (operation.detail.consumes && !operation.detail.consumes.some(c => c === 'application/json') && !operation.detail.consumes.some(c => c.startsWith('text/'))) {
        throw Error(`Unsupported consume content type: ${operation.detail.consumes.join(', ')}`)
      } else {
        body = (operation.detail.parameters || []).filter(p => p.in === 'body')[0]
        if (body) {
          if (body.schema.type === 'string') {
            bodyClass = 'String'
            bodyParam = 'body'
          } else {
            bodyClass = R.last(body.schema['$ref'].split('/'))
            bodyParam = changeCase.lowerCaseFirst(bodyClass)
            bodyClass = 'com.ringcentral.definitions.' + bodyClass
          }
        }
      }
      if (formUrlEncoded || multipart) {
        bodyClass = `com.ringcentral.definitions.${changeCase.pascalCase(operation.detail.operationId)}Request`
        bodyParam = `${operation.detail.operationId}Request`
        body = (operation.detail.parameters || []).filter(p => p.in === 'body' && p.schema && p.schema['$ref'])[0]
        if (body) {
          bodyClass = R.last(body.schema['$ref'].split('/'))
          bodyParam = changeCase.lowerCaseFirst(bodyClass)
          bodyClass = 'com.ringcentral.definitions.' + bodyClass
        }
      }

      const queryParams = (operation.detail.parameters || []).filter(p => p.in === 'query')
      const withParam = paramName && operation.endpoint.endsWith('}')
      const methodParams = []
      if (bodyParam) {
        methodParams.push(`${bodyParam}: ${bodyClass}`)
      }
      if (queryParams.length > 0) {
        methodParams.push(`queryParams: com.ringcentral.definitions.${changeCase.pascalCase(operation.detail.operationId)}Parameters? = null`)
      }
      code += `

      /**
       * Operation: ${operation.detail.summary || changeCase.titleCase(operation.detail.operationId)}
       * Http ${method} ${operation.endpoint}
       */
      ${methodParams.join(', ').includes(' = ') ? '@JvmOverloads ' : ''}fun ${smartMethod.toLowerCase()}(${methodParams.join(', ')}) : ${responseType}?
      {${withParam ? `
          if (this.${paramName} == null)
          {
              throw NullPointerException("${paramName}");
          }
` : ''}`
      if (formUrlEncoded) {
        code += `
        val rb: okhttp3.ResponseBody = rc.${method.toLowerCase()}(this.path(${(!withParam && paramName) ? 'false' : ''})${bodyParam ? `, ${bodyParam}` : ''}${queryParams.length > 0 ? `, queryParams` : ', null'}, com.ringcentral.ContentType.FORM)
        `
      } else if (multipart) {
        code += `
        val rb: okhttp3.ResponseBody = rc.${method.toLowerCase()}(this.path(${(!withParam && paramName) ? 'false' : ''})${bodyParam ? `, ${bodyParam}` : ''}${queryParams.length > 0 ? `, queryParams` : ', null'}, com.ringcentral.ContentType.MULTIPART)
        `
      } else {
        code += `
        val rb: okhttp3.ResponseBody = rc.${method.toLowerCase()}(this.path(${(!withParam && paramName) ? 'false' : ''})${bodyParam ? `, ${bodyParam}` : ''}${queryParams.length > 0 ? `, queryParams` : ''})
        `
      }
      if (responseType === 'ByteArray') {
        code += `
        return rb.source().readByteArray()
        `
      } else if (responseType === 'String') {
        code += `
        return rb.string()
        `
      } else {
        code += `
        return com.alibaba.fastjson.JSON.parseObject(rb.string(), ${responseType}::class.java)
      `
      }
      code += `
    }
    `
    })

    code += `
}
`
    fs.writeFileSync(path.join(folderPath, 'Index.kt'), code)

    if (routes.length > 1) {
      const parentFolder = R.init(folderPath.split(path.sep)).join(path.sep)
      console.log(parentFolder)
      appendCodeToFile(path.join(parentFolder, 'Index.kt'), `
      ${paramName ? '@JvmOverloads ' : ''}fun ${R.last(routes).toLowerCase()}(${paramName ? `${paramName}: String? = ${defaultParamValue ? `"${defaultParamValue}"` : 'null'}` : ''}) : com.ringcentral.paths.${routes.join('.').toLowerCase()}.Index
      {
        return com.ringcentral.paths.${routes.join('.').toLowerCase()}.Index(this${paramName ? `, ${paramName}` : ''})
      }
    `)
    }

    generate(`${prefix}${name}/`)
    if (paramName) {
      generate(`${prefix}${name}/{${paramName}}/`)
    }
  })(nextLevels)
}

generate('/')
