package com.ringcentral.definitions;


// Attachment is a file to be uploaded
public class Attachment {
    /**
     * Filename with extension
     * Example: example.png
     */
    public String filename;
    /**
     * Binary content of the file
     * Required
     */
    public byte[] content;
    /**
     * Content type of the file, such as "image/png"
     */
    public String contentType;

    public Attachment filename(String filename) {
        this.filename = filename;
        return this;
    }

    public Attachment content(byte[] content) {
        this.content = content;
        return this;
    }

    public Attachment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
