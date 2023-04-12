package com.ringcentral.definitions;


public class ContentInput {
    /**
     * Publicly facing uri
     * Format: uri
     */
    public String contentUri;

    public ContentInput contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
}
