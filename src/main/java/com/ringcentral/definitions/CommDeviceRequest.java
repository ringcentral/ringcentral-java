package com.ringcentral.definitions;


public class CommDeviceRequest {
    /**
     * Internal identifier of a device
     * Required
     * Example: 5423543
     */
    public String id;

    public CommDeviceRequest id(String id) {
        this.id = id;
        return this;
    }
}
