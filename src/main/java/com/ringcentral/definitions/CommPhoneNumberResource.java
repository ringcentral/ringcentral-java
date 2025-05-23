package com.ringcentral.definitions;


public class CommPhoneNumberResource {
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     * Required
     */
    public String phoneNumber;

    public CommPhoneNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
