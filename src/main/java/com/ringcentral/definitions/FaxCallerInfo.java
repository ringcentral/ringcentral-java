package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FaxCallerInfo
{
    // Recipient information. Phone number property is mandatory. Optional for resend fax request
    public String phoneNumber;
    public FaxCallerInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
