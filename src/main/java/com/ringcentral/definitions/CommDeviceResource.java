package com.ringcentral.definitions;


public class CommDeviceResource {
    /**
     * Internal identifier of a device
     * Required
     * Example: 5423543
     */
    public String id;
    /**
     * Device name
     * Example: HP2
     */
    public String name;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String phoneNumber;

    public CommDeviceResource id(String id) {
        this.id = id;
        return this;
    }

    public CommDeviceResource name(String name) {
        this.name = name;
        return this;
    }

    public CommDeviceResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
