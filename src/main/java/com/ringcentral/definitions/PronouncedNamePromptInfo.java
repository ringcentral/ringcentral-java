package com.ringcentral.definitions;


public class PronouncedNamePromptInfo {
    /**
     *
     */
    public String id;
    /**
     * Link to a prompt resource
     * Format: uri
     */
    public String contentUri;
    /**
     * Content media type
     * Enum: audio/mpeg, audio/wav
     */
    public String contentType;

    public PronouncedNamePromptInfo id(String id) {
        this.id = id;
        return this;
    }

    public PronouncedNamePromptInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public PronouncedNamePromptInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
