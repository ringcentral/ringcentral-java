package com.ringcentral.definitions;

public class InstantMessageAttachmentInfo {
    // Internal identifier of a message attachment
    public String id;
    // Type of a message attachment. The default value is 'Text'
    public String type;
    // Content type of an attachment, see also MIME Types. The default value is 'text/plain'
    public String contentType;

    public InstantMessageAttachmentInfo id(String id) {
        this.id = id;
        return this;
    }

    public InstantMessageAttachmentInfo type(String type) {
        this.type = type;
        return this;
    }

    public InstantMessageAttachmentInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
