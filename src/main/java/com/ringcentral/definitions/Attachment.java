package com.ringcentral.definitions;

public class Attachment {
    /**
     * File name with extension, such as "example.png"
     */
    public String fileName;
    /**
     * Binary content of the file
     */
    public byte[] bytes;
    /**
     * Content tyle of the file, such as "image/png"
     */
    public String contentType;

    public Attachment fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Attachment bytes(byte[] bytes) {
        this.bytes = bytes;
        return this;
    }

    public Attachment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}