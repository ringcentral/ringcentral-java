package com.ringcentral.definitions;


public class ReplacePhoneNumberRequest {
    /**
     * Internal unique identifier of a phone number
     * Example: 1162820004
     */
    public String targetPhoneNumberId;

    public ReplacePhoneNumberRequest targetPhoneNumberId(String targetPhoneNumberId) {
        this.targetPhoneNumberId = targetPhoneNumberId;
        return this;
    }
}
