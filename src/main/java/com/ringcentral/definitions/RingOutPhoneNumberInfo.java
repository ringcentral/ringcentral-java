package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RingOutPhoneNumberInfo
{
    //
    public String phoneNumber;
    public RingOutPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
