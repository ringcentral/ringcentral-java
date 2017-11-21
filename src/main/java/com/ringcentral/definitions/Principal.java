package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Principal
{
    //
    public String name;
    public Principal name(String name) {
        this.name = name;
        return this;
    }
}
