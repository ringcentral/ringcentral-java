package com.ringcentral.definitions;

/** File information */
public class TMAddFile {
    /** Internal identifier of a file Required */
    public String id;

    public TMAddFile id(String id) {
        this.id = id;
        return this;
    }

    /** Link to a binary content Required Format: uri */
    public String contentUri;

    public TMAddFile contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    /** Name of a file */
    public String name;

    public TMAddFile name(String name) {
        this.name = name;
        return this;
    }
}
