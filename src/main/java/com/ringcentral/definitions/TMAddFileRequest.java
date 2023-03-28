package com.ringcentral.definitions;


public class TMAddFileRequest {
    /**
     * Internal identifier of a file
     * Required
     */
    public String id;
    /**
     * Link to binary content
     * Required
     * Format: uri
     */
    public String contentUri;
    /**
     * Name of a file
     */
    public String name;

    public TMAddFileRequest id(String id) {
        this.id = id;
        return this;
    }

    public TMAddFileRequest contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public TMAddFileRequest name(String name) {
        this.name = name;
        return this;
    }
}
