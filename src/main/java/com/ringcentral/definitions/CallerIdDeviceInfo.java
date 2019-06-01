package com.ringcentral.definitions;


public class CallerIdDeviceInfo {
    /**
     * Internal identifier of a device
     */
    public String id;
    /**
     * Link to a device resource
     */
    public String uri;
    /**
     * Name of a device
     */
    public String phoneNumber;

    public CallerIdDeviceInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallerIdDeviceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallerIdDeviceInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
