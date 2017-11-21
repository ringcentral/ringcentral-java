package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EntityTag
{
    //
    public String value;
    public EntityTag value(String value) {
        this.value = value;
        return this;
    }
    //
    public Boolean weak;
    public EntityTag weak(Boolean weak) {
        this.weak = weak;
        return this;
    }
}
