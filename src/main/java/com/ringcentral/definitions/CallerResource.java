package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerResource
{
    //
    public String callerId;
    public CallerResource callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
    //
    public String name;
    public CallerResource name(String name) {
        this.name = name;
        return this;
    }
}
