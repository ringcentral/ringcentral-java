package com.ringcentral.definitions;

public class RingOut_Request_From {
    // Phone number in E.164 format
    public String phoneNumber;
    // Internal identifier of a forwarding number; returned in response in the id field. Can be specified instead of the phoneNumber attribute
    public String forwardingNumberId;

    public RingOut_Request_From phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public RingOut_Request_From forwardingNumberId(String forwardingNumberId) {
        this.forwardingNumberId = forwardingNumberId;
        return this;
    }
}
