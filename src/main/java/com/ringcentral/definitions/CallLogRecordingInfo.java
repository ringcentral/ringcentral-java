package com.ringcentral.definitions;


/**
 * Call recording data. Returned if the call was recorded
 */
public class CallLogRecordingInfo {
    /**
     * Internal identifier of the call recording
     * Required
     */
    public String id;
    /**
     * Link to the call recording metadata resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * Indicates recording mode used
     * Required
     * Enum: Automatic, OnDemand
     */
    public String type;
    /**
     * Link to a call recording binary content. Has to be retrieved with proper authorization
     * (access token must be passed via `Authorization` header or query parameter)
     * Required
     * Format: uri
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
