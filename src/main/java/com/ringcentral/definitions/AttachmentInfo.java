package com.ringcentral.definitions;

public class AttachmentInfo {
    // Link to custom data attachment
    public String uri;
    // Type of custom data attachment, see also MIME Types
    public String contentType;

    public AttachmentInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AttachmentInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
