package com.ringcentral.definitions;

public class GrantInfo_ExtensionInfo {
    // Internal identifier of an extension
    public String id;
    // Canonical URI of an extension
    public String uri;
    // Extension short number (usually 3 or 4 digits)
    public String extensionNumber;
    // Extension type
    public String type;

    public GrantInfo_ExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public GrantInfo_ExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GrantInfo_ExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public GrantInfo_ExtensionInfo type(String type) {
        this.type = type;
        return this;
    }
}
