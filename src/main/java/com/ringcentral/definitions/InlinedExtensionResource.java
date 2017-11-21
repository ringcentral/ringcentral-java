package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class InlinedExtensionResource
{
    //
    public String uri;
    public InlinedExtensionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String extensionNumber;
    public InlinedExtensionResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public String id;
    public InlinedExtensionResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String type;
    public InlinedExtensionResource type(String type) {
        this.type = type;
        return this;
    }
}
