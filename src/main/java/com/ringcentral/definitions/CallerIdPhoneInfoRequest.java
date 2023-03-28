package com.ringcentral.definitions;


public class CallerIdPhoneInfoRequest {
    /**
     * Internal identifier of a phone number
     */
    public String id;

    public CallerIdPhoneInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
