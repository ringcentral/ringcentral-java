package com.ringcentral.definitions;

public class PresenceInfo_ExtensionInfo {
    // Internal identifier of an extension
    public String id;
    // Canonical URI of an extension
    public String uri;
    // Extension number (usually 3 or 4 digits)
    public String extensionNumber;

    public PresenceInfo_ExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public PresenceInfo_ExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PresenceInfo_ExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
