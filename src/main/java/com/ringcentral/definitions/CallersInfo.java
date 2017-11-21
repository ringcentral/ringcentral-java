package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallersInfo
{
    // Phone number of a caller
    public String callerId;
    public CallersInfo callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
    // Contact name of a caller
    public String name;
    public CallersInfo name(String name) {
        this.name = name;
        return this;
    }
}
