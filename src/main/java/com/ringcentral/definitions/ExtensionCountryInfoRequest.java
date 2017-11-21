package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionCountryInfoRequest
{
    // internal Identifier for country
    public String id;
    public ExtensionCountryInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
