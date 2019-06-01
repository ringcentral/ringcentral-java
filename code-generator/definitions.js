import yaml from 'js-yaml'
import fs from 'fs'
import path from 'path'
import pascalCase from 'pascal-case'

const outputDir = '../src/main/java/com/ringcentral/definitions'

const doc = yaml.safeLoad(fs.readFileSync('/Users/tyler.liu/src/dotnet/RingCentral.Net/code-generator/rc-platform-adjusted.yml', 'utf8'))
const definitions = doc.definitions
const models = Object.keys(definitions).map(k => ({ name: k, ...definitions[k] }))
  .filter(m => m.type !== 'array')

const keys = []
models.forEach(m => {
  Object.keys(m).forEach(k => keys.push(k))
})

const normalizeType = f => {
  if (f.type === 'integer') {
    return 'Long'
  } else if (f.type === 'array') {
    return `${normalizeType(f.items)}[]`
  } else if (f.type === undefined || f.type === 'object') {
    if (!f['$ref']) {
      return 'Object' // anonymous object
    }
    return f['$ref'].split('/').slice(-1)[0]
  } else if (f.type === 'boolean') {
    return 'Boolean'
  } else if (f.type === 'file') {
    return 'Attachment'
  } else if (f.type === 'string') {
    return 'String'
  } else {
    throw new Error(`Unknown type ${f.type}`)
  }
}

const normalizeField = f => {
  f.type = normalizeType(f)
  return f
}

const generateField = (m, f) => {
  let p = ''
  let pName = f.name
  if (f.name.includes('-')) {
    p += `@JSONField(name="${f.name}")`
    pName = f.name.replace(/-([a-z])/g, (match, p1) => p1.toUpperCase())
    p += `\n        public ${f.type} ${pName};`
  } else if (f.name.includes(':') || f.name.includes('.')) {
    p += `@JSONField(name="${f.name}")`
    pName = f.name.replace(/[:.](\w)/g, '_$1')
    p += `\n        public ${f.type} ${pName};`
  } else if (f.name === 'public' || f.name === 'default') {
    p += `@JSONField(name="${f.name}")`
    pName = `_${f.name}`
    p += `\n        public ${f.type} ${pName};`
  } else {
    p = `public ${f.type} ${f.name};`
  }

  p += `
  public ${m.name} ${pName}(${f.type} ${pName})
  {
    this.${pName} = ${pName};
    return this;
  }
  `

  p = ` */\n        ${p}`
  if (f.enum) {
    p = ` * Enum: ${f.enum.join(', ')}\n        ${p}`
  }
  if (f.default) {
    p = ` * Default: ${f.default}\n        ${p}`
  }
  if (f.minimum) {
    p = ` * Minimum: ${f.minimum}\n        ${p}`
  }
  if (f.maximum) {
    p = ` * Maximum: ${f.maximum}\n        ${p}`
  }
  if (m.required && m.required.includes(f.name)) {
    p = ` * Required\n        ${p}`
  }
  if (f.description) {
    p = `${f.description.trim().split('\n').map(l => ` * ${l}`).join('\n')}\n        ${p}`
  }
  p = `/**\n        ${p}`
  return p
}

const generateCode = (m, fields) => {
  let code = `${m.description ? '\n    // ' + m.description : ''}
public class ${m.name}
{
    ${fields.join('\n\n        ')}
}
`
  if (code.includes('@JSONField(name=')) {
    code = 'import com.alibaba.fastjson.annotation.JSONField;\n\n' + code
  }
  return 'package com.ringcentral.definitions;\n\n' + code
}

models.forEach(m => {
  const properties = m.properties
  const fields = Object.keys(properties)
    .map(k => ({ name: k, ...properties[k] }))
    .map(f => normalizeField(f))
    .map(f => generateField(m, f))
  fs.writeFileSync(path.join(outputDir, `${m.name}.java`), generateCode(m, fields))
})

// generate models for form-data objects
Object.keys(doc.paths).forEach(p => {
  Object.keys(doc.paths[p]).forEach(method => {
    const operation = doc.paths[p][method]
    if ((operation.parameters || []).some(p => p.in === 'formData')) {
      const operationId = operation.operationId
      const className = pascalCase(operationId) + 'Request'
      const fields = operation.parameters.filter(p => p.in === 'formData')
        .map(p => {
          p = normalizeField(p)
          if (p['$ref']) {
            p.type = p['$ref'].split('/').slice(-1)[0]
          }
          return generateField({ name: className }, p)
        })
      fs.writeFileSync(path.join(outputDir, `${className}.java`), generateCode({ name: className }, fields))
    }
  })
})

// generate models for query parameters
Object.keys(doc.paths).forEach(p => {
  Object.keys(doc.paths[p]).forEach(method => {
    const operation = doc.paths[p][method]
    if ((operation.parameters || []).some(p => p.in === 'query')) {
      const operationId = operation.operationId
      const className = pascalCase(operationId) + 'Parameters'
      const fields = operation.parameters.filter(p => p.in === 'query')
        .map(p => {
          p = normalizeField(p)
          return generateField({ name: className }, p)
        })
      fs.writeFileSync(path.join(outputDir, `${className}.java`), generateCode({ name: className }, fields))
    }
  })
})

// Generate Attachment
fs.writeFileSync(path.join(outputDir, 'Attachment.java'), `package com.ringcentral.definitions;
public class Attachment
{
    /**
     * File name with extension, such as "example.png"
     */
    public String fileName;
    public Attachment fileName(String fileName)
    {
      this.fileName = fileName;
      return this;
    }

    /**
     * Binary content of the file
     */
    public byte[] bytes;
    public Attachment bytes(byte[] bytes)
    {
      this.bytes = bytes;
      return this;
    }

    /**
     * Content tyle of the file, such as "image/png"
     */
    public String contentType;
    public Attachment contentType(String contentType)
    {
      this.contentType = contentType;
      return this;
    }
}`)
