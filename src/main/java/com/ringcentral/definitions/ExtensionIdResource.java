package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionIdResource
{
    //
    public String uri;
    public ExtensionIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public ExtensionIdResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String extensionNumber;
    public ExtensionIdResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
