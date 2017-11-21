package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MethodInfo
{
    // Method identifier. The default value is  1  (Ground)
    public String id;
    public MethodInfo id(String id) {
        this.id = id;
        return this;
    }
    // Method name, corresponding to the identifier
    public String name;
    public MethodInfo name(String name) {
        this.name = name;
        return this;
    }
}
