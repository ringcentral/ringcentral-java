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
