package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseExtensionInfo
{
    // Internal identifier of an extension
    public String id;
    public LicenseExtensionInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an extension
    public String uri;
    public LicenseExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Number of an extension
    public String extensionNumber;
    public LicenseExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // User name of an extension
    public String name;
    public LicenseExtensionInfo name(String name) {
        this.name = name;
        return this;
    }
}
