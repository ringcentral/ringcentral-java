package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Request
{
    //
    public String method;
    public Request method(String method) {
        this.method = method;
        return this;
    }
}
