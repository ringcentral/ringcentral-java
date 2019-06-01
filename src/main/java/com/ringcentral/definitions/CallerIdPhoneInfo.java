package com.ringcentral.definitions;


public class CallerIdPhoneInfo {
    /**
     * Internal identifier of a phone number
     */
    public String id;
    /**
     * Link to a phone number resource
     */
    public String uri;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
     */
    public String phoneNumber;

    public CallerIdPhoneInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallerIdPhoneInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallerIdPhoneInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
