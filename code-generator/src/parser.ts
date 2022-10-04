import {parse} from 'ringcentral-open-api-parser';
import fs from 'fs';
import yaml from 'js-yaml';
import {OpenAPIV3} from 'openapi-types';

const doc = yaml.load(
  fs.readFileSync(process.env.spec_file_path!, 'utf8')
) as OpenAPIV3.Document;

export const parsed = parse(doc);
