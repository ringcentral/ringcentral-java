package com.ringcentral.definitions;


public class CallFlipNumberResource {
    /**
     * Internal identifier of a call flip number
     * Example: 409926525004
     */
    public String id;
    /**
     * Flip number in E.164 format with &#039;+&#039;
     * Example: +16502096935
     */
    public String phoneNumber;
    /**
     * Flip number type
     * Example: PhoneLine
     * Enum: PhoneLine, External
     */
    public String type;
    /**
     * Flip number label, device name for Digital Line case
     * Example: My Mobile Number
     */
    public String label;
    /**
     * Speed dial/flip number, the range is 1-8
     * Example: 5
     */
    public String flipNumber;

    public CallFlipNumberResource id(String id) {
        this.id = id;
        return this;
    }

    public CallFlipNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CallFlipNumberResource type(String type) {
        this.type = type;
        return this;
    }

    public CallFlipNumberResource label(String label) {
        this.label = label;
        return this;
    }

    public CallFlipNumberResource flipNumber(String flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }
}
