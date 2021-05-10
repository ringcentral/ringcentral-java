package com.ringcentral.definitions;


public class TaskAttachment {
    /**
     * Internal identifier of a file
     */
    public String id;
    /**
     * Attachment type (currently only `File` value is supported).
     * Enum: File
     */
    public String type;
    /**
     * Name of the attached file (including extension name).
     */
    public String name;
    /**
     * Link to an attachment content
     */
    public String contentUri;

    public TaskAttachment id(String id) {
        this.id = id;
        return this;
    }

    public TaskAttachment type(String type) {
        this.type = type;
        return this;
    }

    public TaskAttachment name(String name) {
        this.name = name;
        return this;
    }

    public TaskAttachment contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
}
