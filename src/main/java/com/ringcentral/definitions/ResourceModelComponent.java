package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ResourceModelComponent
{
    //
    public ResourceModelComponent[] components;
    public ResourceModelComponent components(ResourceModelComponent[] components) {
        this.components = components;
        return this;
    }
}
