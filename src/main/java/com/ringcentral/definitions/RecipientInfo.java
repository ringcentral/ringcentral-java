package com.ringcentral.definitions;


/**
 * Recipient data
 */
public class RecipientInfo {
    /**
     * Link to a voicemail recipient extension resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a voicemail recipient
     */
    public String id;

    public RecipientInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RecipientInfo id(String id) {
        this.id = id;
        return this;
    }
}
