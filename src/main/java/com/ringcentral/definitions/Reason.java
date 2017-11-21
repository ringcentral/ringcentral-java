package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Reason
{
    //
    public String id;
    public Reason id(String id) {
        this.id = id;
        return this;
    }
    //
    public String message;
    public Reason message(String message) {
        this.message = message;
        return this;
    }
}
