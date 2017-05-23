package com.ringcentral.definitions;

public class RingOut_Request_From {
    // Phone number in E.164 format
    public String phoneNumber;
    // Internal identifier of a forwarding number; returned in response in the id field. Can be specified instead of the phoneNumber attribute
    public String forwardingNumberId;
}
