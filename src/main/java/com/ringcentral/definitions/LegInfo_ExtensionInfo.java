package com.ringcentral.definitions;

public class LegInfo_ExtensionInfo {
    // Internal identifier of an extension
    public String id;
    // Canonical URI of an extension
    public String uri;

    public LegInfo_ExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public LegInfo_ExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
