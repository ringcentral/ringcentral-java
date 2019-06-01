import * as R from 'ramda'
import fs from 'fs'

export const normalizePath = path => {
  return path
    .replace(/\/restapi\/v1\.0\//, '/restapi/{apiVersion}/')
    .replace(/\/scim\/v2/, '/scim/{version}')
    .replace(/\/\.search/, '/dotSearch')
}

export const deNormalizePath = path => {
  return path
    .replace(/\/restapi\/\{apiVersion\}\//, '/restapi/v1.0/')
    .replace(/\/scim\/\{version\}/, '/scim/v2')
    .replace(/\/dotSearch/, '/.search')
}

export const appendCodeToFile = (filePath, content) => {
  let data = fs.readFileSync(filePath, 'utf8')
  data = `${R.init(data.trim().split('\n')).join('\n')}\n\n${content}\n}`
  fs.writeFileSync(filePath, data)
}

export const getResponseType = responses => {
  const responseSchema = (responses[200] || responses[201] || responses[202] || responses[204] || responses[205] || responses[302] || responses.default).schema
  let responseType
  if (responseSchema) {
    if (responseSchema.type === 'string' && responseSchema.format === 'binary') {
      responseType = 'ByteArray'
    } else if (responseSchema['$ref']) {
      responseType = 'com.ringcentral.definitions.' + R.last(responseSchema['$ref'].split('/'))
    }
  }
  return responseType
}
