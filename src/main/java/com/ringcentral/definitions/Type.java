package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Type
{
    //
    public String typeName;
    public Type typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
}
