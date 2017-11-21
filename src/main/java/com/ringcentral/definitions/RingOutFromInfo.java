package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RingOutFromInfo
{
    //
    public String phoneNumber;
    public RingOutFromInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String forwardingNumberId;
    public RingOutFromInfo forwardingNumberId(String forwardingNumberId) {
        this.forwardingNumberId = forwardingNumberId;
        return this;
    }
}
