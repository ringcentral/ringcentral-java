package com.ringcentral.definitions;


public class GlipMessageAttachmentAuthorInfo {
    /**
     * Name of a message author
     */
    public String name;
    /**
     * Link to an author's name
     */
    public String uri;
    /**
     * Link to an image displayed to the left of an author's name; sized 82x82px
     */
    public String iconUri;

    public GlipMessageAttachmentAuthorInfo name(String name) {
        this.name = name;
        return this;
    }

    public GlipMessageAttachmentAuthorInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GlipMessageAttachmentAuthorInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }

}
