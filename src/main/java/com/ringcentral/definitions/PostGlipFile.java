package com.ringcentral.definitions;


public class PostGlipFile {
    /**
     * Internal identifier of a file
     * Required
     */
    public String id;
    /**
     * Link to binary content
     * Required
     */
    public String contentUri;
    /**
     * Name of a file
     */
    public String name;

    public PostGlipFile id(String id) {
        this.id = id;
        return this;
    }

    public PostGlipFile contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public PostGlipFile name(String name) {
        this.name = name;
        return this;
    }
}
