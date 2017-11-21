package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EmailInfoRequest
{
    // Email address
    public String value;
    public EmailInfoRequest value(String value) {
        this.value = value;
        return this;
    }
    // Email address type
    public String type;
    public EmailInfoRequest type(String type) {
        this.type = type;
        return this;
    }
}
