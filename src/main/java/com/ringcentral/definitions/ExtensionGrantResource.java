package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionGrantResource
{
    //
    public String uri;
    public ExtensionGrantResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public InlinedExtensionResource extension;
    public ExtensionGrantResource extension(InlinedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
    //
    public Boolean callPickup;
    public ExtensionGrantResource callPickup(Boolean callPickup) {
        this.callPickup = callPickup;
        return this;
    }
    //
    public Boolean callMonitoring;
    public ExtensionGrantResource callMonitoring(Boolean callMonitoring) {
        this.callMonitoring = callMonitoring;
        return this;
    }
}
