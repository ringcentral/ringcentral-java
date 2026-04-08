package com.ringcentral.definitions;

/** Extension information */
public class SiteIVRActionsExtensionInfo {
    /** Internal identifier of an extension */
    public String id;

    public SiteIVRActionsExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Canonical URI of an extension Format: uri */
    public String uri;

    public SiteIVRActionsExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Name of an extension user */
    public String name;

    public SiteIVRActionsExtensionInfo name(String name) {
        this.name = name;
        return this;
    }
}
