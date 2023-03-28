package com.ringcentral.definitions;


public class TMAttachmentAuthorInfo {
    /**
     * Name of a message author
     */
    public String name;
    /**
     * Link to an author&#039;s name
     * Format: uri
     */
    public String uri;
    /**
     * Link to an image displayed to the left of an author&#039;s name; sized 82x82px
     * Format: uri
     */
    public String iconUri;

    public TMAttachmentAuthorInfo name(String name) {
        this.name = name;
        return this;
    }

    public TMAttachmentAuthorInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public TMAttachmentAuthorInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }
}
