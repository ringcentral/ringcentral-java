package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UnconditionalForwardingResource
{
    //
    public String phoneNumber;
    public UnconditionalForwardingResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
