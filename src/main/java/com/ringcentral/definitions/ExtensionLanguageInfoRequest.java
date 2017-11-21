package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionLanguageInfoRequest
{
    // internal Identifier of a language
    public String id;
    public ExtensionLanguageInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
