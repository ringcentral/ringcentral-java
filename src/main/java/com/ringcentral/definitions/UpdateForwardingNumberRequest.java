package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UpdateForwardingNumberRequest
{
    // Forwarding/Call flip phone number
    public String phoneNumber;
    public UpdateForwardingNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Forwarding/Call flip number title
    public String label;
    public UpdateForwardingNumberRequest label(String label) {
        this.label = label;
        return this;
    }
    // Number assigned to the call flip phone number, corresponds to the shortcut dial number
    public String flipNumber;
    public UpdateForwardingNumberRequest flipNumber(String flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }
}
