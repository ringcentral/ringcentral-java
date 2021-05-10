package com.ringcentral.definitions;


public class IgnoreRequestBody {
    /**
     * Internal device identifier
     * Required
     * Example: 400020454008
     */
    public String deviceId;

    public IgnoreRequestBody deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
}
