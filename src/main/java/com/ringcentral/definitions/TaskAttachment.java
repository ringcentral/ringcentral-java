package com.ringcentral.definitions;


public class TaskAttachment {
    /**
     * File ID.
     */
    public String id;
    /**
     * Possible value: File. Attachment type (currently, only File is possible).
     * Enum: File
     */
    public String type;
    /**
     * Name of the attached file (incl. extension name).
     */
    public String name;
    /**
     * URI
     * Format: uri
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
