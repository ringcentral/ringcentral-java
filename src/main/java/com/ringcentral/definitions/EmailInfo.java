package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EmailInfo
{
    // Email address
    public String value;
    public EmailInfo value(String value) {
        this.value = value;
        return this;
    }
    // Email address type
    public String type;
    public EmailInfo type(String type) {
        this.type = type;
        return this;
    }
}
