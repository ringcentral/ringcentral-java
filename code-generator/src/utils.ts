export const escapeJavaDoc = (str: string | undefined) => {
  if (typeof str === 'string') {
    return str
      .replace('<', '{@literal <}')
      .replace('>', '{@literal >}')
      .replace('&', '{@literal &}');
  }
  return str;
};
