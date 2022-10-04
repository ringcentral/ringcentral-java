package com.ringcentral.definitions;


public class DeviceResourcePhoneNumber {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String e164;
    /**
     *
     */
    public String formatted;

    public DeviceResourcePhoneNumber id(String id) {
        this.id = id;
        return this;
    }

    public DeviceResourcePhoneNumber e164(String e164) {
        this.e164 = e164;
        return this;
    }

    public DeviceResourcePhoneNumber formatted(String formatted) {
        this.formatted = formatted;
        return this;
    }
}
