package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionInfoSIP
{
    // Internal identifier of an extension
    public String id;
    public ExtensionInfoSIP id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an extension
    public String uri;
    public ExtensionInfoSIP uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Extension number
    public String extensionNumber;
    public ExtensionInfoSIP extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
