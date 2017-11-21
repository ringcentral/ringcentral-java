package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class IVRMenuExtensionInfo
{
    // Link to an extension resource
    public String uri;
    public IVRMenuExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of an extension
    public String id;
    public IVRMenuExtensionInfo id(String id) {
        this.id = id;
        return this;
    }
}
