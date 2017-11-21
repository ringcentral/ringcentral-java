package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreateForwardingNumberRequest
{
    // Forwarding/Call flip phone number
    public String phoneNumber;
    public CreateForwardingNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Forwarding/Call flip number title
    public String label;
    public CreateForwardingNumberRequest label(String label) {
        this.label = label;
        return this;
    }
}
