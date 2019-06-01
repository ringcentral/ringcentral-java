package com.ringcentral.definitions;


public class MakeRingOutCallerInfoRequestTo {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;

    public MakeRingOutCallerInfoRequestTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
