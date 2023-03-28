package com.ringcentral.definitions;


/**
 * Fax receiver
 */
public class FaxReceiver {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;
    /**
     * Name of the receiver
     */
    public String name;

    public FaxReceiver phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public FaxReceiver name(String name) {
        this.name = name;
        return this;
    }
}
