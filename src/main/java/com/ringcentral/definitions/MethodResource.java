package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MethodResource
{
    //
    public String id;
    public MethodResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public MethodResource name(String name) {
        this.name = name;
        return this;
    }
}
