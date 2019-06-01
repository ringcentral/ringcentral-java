package com.ringcentral.definitions;


public class CallLogRecordingInfo {
    /**
     * Internal identifier of the call recording
     */
    public String id;
    /**
     * Link to the call recording metadata resource
     */
    public String uri;
    /**
     * Indicates recording mode used
     * Enum: Automatic, OnDemand
     */
    public String type;
    /**
     * Link to the call recording binary content
     */
    public String contentUri;

    public CallLogRecordingInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallLogRecordingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallLogRecordingInfo type(String type) {
        this.type = type;
        return this;
    }

    public CallLogRecordingInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

}
