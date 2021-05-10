package com.ringcentral.definitions;


// Message sender information. The `phoneNumber` value should be one the account phone numbers allowed to send the current type of messages
public class MessageStoreCallerInfoRequest {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;

    public MessageStoreCallerInfoRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
