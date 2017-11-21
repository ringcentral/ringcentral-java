package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumberInfoRequest
{
    // Phone number
    public String value;
    public PhoneNumberInfoRequest value(String value) {
        this.value = value;
        return this;
    }
    // Phone number type
    public String type;
    public PhoneNumberInfoRequest type(String type) {
        this.type = type;
        return this;
    }
}
