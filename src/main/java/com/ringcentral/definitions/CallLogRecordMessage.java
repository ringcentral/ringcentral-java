package com.ringcentral.definitions;


/**
 * Linked message (Fax/Voicemail)
 */
public class CallLogRecordMessage {
    /**
     * Internal identifier of a message
     * Required
     */
    public String id;
    /**
     * Type of message
     * Required
     */
    public String type;
    /**
     * Link to a message resource
     * Required
     * Format: uri
     */
    public String uri;

    public CallLogRecordMessage id(String id) {
        this.id = id;
        return this;
    }

    public CallLogRecordMessage type(String type) {
        this.type = type;
        return this;
    }

    public CallLogRecordMessage uri(String uri) {
        this.uri = uri;
        return this;
    }
}
