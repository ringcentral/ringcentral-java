package com.ringcentral.definitions;


public class MakeRingOutCallerInfoRequestFrom {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;
    /**
     * Internal identifier of a forwarding number; returned in response as an 'id' field value. Can be specified instead of the phoneNumber attribute
     */
    public String forwardingNumberId;

    public MakeRingOutCallerInfoRequestFrom phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MakeRingOutCallerInfoRequestFrom forwardingNumberId(String forwardingNumberId) {
        this.forwardingNumberId = forwardingNumberId;
        return this;
    }

}
