package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MakeRingOutCallerInfoRequestFrom
{
    // Phone number in E.164 format
    public String phoneNumber;
    public MakeRingOutCallerInfoRequestFrom phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Internal identifier of a forwarding number; returned in response in the id field. Can be specified instead of the phoneNumber attribute
    public String forwardingNumberId;
    public MakeRingOutCallerInfoRequestFrom forwardingNumberId(String forwardingNumberId) {
        this.forwardingNumberId = forwardingNumberId;
        return this;
    }
}
