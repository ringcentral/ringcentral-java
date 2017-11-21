package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetPresenceExtensionInfo
{
    // Internal identifier of an extension
    public String id;
    public GetPresenceExtensionInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an extension
    public String uri;
    public GetPresenceExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Extension number (usually 3 or 4 digits)
    public String extensionNumber;
    public GetPresenceExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
