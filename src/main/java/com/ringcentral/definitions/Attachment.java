package com.ringcentral.definitions;
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
}