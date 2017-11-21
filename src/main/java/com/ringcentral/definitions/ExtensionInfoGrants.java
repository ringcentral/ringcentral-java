package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionInfoGrants
{
    // Internal identifier of an extension
    public String id;
    public ExtensionInfoGrants id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of an extension
    public String uri;
    public ExtensionInfoGrants uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Extension short number (usually 3 or 4 digits)
    public String extensionNumber;
    public ExtensionInfoGrants extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Extension type
    public String type;
    public ExtensionInfoGrants type(String type) {
        this.type = type;
        return this;
    }
}
