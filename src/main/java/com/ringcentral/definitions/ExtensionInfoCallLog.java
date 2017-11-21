package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionInfoCallLog
{
    // Internal identifier of an extension
    public String id;
    public ExtensionInfoCallLog id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an extension
    public String uri;
    public ExtensionInfoCallLog uri(String uri) {
        this.uri = uri;
        return this;
    }
}
