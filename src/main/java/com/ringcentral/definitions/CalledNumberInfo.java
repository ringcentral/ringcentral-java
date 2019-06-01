package com.ringcentral.definitions;


public class CalledNumberInfo {
    /**
     * Called phone number
     */
    public String phoneNumber;

    public CalledNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
