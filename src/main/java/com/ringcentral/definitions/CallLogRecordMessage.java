package com.ringcentral.definitions;


// Linked message (Fax/Voicemail)
public class CallLogRecordMessage {
    /**
     * Internal identifier of a message
     */
    public String id;
    /**
     * Type of a message
     */
    public String type;
    /**
     * Link to a message resource
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
