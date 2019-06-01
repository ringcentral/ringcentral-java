package com.ringcentral.definitions;


public class UnconditionalForwardingInfo {
    /**
     * Phone number to which the call is forwarded
     */
    public String phoneNumber;

    public UnconditionalForwardingInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
