package com.ringcentral.definitions;


public class CallLogRecordDeviceInfo {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Canonical URI of a device resource
     * Format: uri
     */
    public String uri;

    public CallLogRecordDeviceInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallLogRecordDeviceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
