package com.ringcentral.definitions;

public class MessagePhoneParty {
    /** Phone number in e.164 format (with &#039;+&#039; prefix) Required Example: +16501234567 */
    public String phoneNumber;

    public MessagePhoneParty phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
