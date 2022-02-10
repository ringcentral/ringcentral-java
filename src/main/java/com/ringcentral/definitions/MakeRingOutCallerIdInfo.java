package com.ringcentral.definitions;


/**
 * The number which will be displayed to the called party
 */
public class MakeRingOutCallerIdInfo {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;

    public MakeRingOutCallerIdInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
