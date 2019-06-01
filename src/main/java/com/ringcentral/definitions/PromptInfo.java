package com.ringcentral.definitions;


public class PromptInfo {
    /**
     * Internal identifier of a prompt
     */
    public String uri;
    /**
     * Link to a prompt metadata
     */
    public String id;
    /**
     * Type of a prompt media content
     */
    public String contentType;
    /**
     * Link to a prompt media content
     */
    public String contentUri;
    /**
     * Name of a prompt
     */
    public String filename;

    public PromptInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PromptInfo id(String id) {
        this.id = id;
        return this;
    }

    public PromptInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public PromptInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public PromptInfo filename(String filename) {
        this.filename = filename;
        return this;
    }

}
