package com.ringcentral.definitions;

public class RingOut_Request_To {
    // Phone number in E.164 format
    public String phoneNumber;

    public RingOut_Request_To phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
