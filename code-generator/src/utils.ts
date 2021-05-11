import path from 'path';
import fs from 'fs';

export const escapeJavaDoc = (str: string | undefined) => {
  if (typeof str === 'string') {
    return str
      .replace('<', '{@literal <}')
      .replace('>', '{@literal >}')
      .replace('&', '{@literal &}');
  }
  return str;
};

export const capitalizeFirstLetter = (s: string): string => {
  return s.charAt(0).toUpperCase() + s.slice(1);
};

export const patchSrcFile = (
  fileRoutes: string[],
  imports: string[],
  extensions: string
) => {
  const filePath = path.join(
    __dirname,
    '..',
    '..',
    'src',
    'main',
    'java',
    'com',
    'ringcentral',
    ...fileRoutes
  );
  let code = fs.readFileSync(filePath, 'utf8');
  if (imports && imports.length > 0) {
    code = `${imports.join('\n')}\n${code}`;
  }
  if (extensions) {
    code = code.replace(/^}/m, `\n  ${extensions}\n}`);
  }
  fs.writeFileSync(filePath, code);
};
