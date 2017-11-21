package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionGreetingLanguageInfoRequest
{
    // internal Identifier of a greeting language
    public String id;
    public ExtensionGreetingLanguageInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
