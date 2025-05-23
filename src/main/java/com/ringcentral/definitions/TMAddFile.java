package com.ringcentral.definitions;


/**
 * File information
 */
public class TMAddFile {
    /**
     * Internal identifier of a file
     * Required
     */
    public String id;
    /**
     * Link to a binary content
     * Required
     * Format: uri
     */
    public String contentUri;
    /**
     * Name of a file
     */
    public String name;

    public TMAddFile id(String id) {
        this.id = id;
        return this;
    }

    public TMAddFile contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public TMAddFile name(String name) {
        this.name = name;
        return this;
    }
}
