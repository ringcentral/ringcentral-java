package com.ringcentral.definitions;


/**
 * Extension information
 */
public class SiteIVRActionsExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension
     * Format: uri
     */
    public String uri;
    /**
     * Name of an extension user
     */
    public String name;

    public SiteIVRActionsExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public SiteIVRActionsExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SiteIVRActionsExtensionInfo name(String name) {
        this.name = name;
        return this;
    }
}
