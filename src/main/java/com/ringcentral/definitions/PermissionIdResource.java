package com.ringcentral.definitions;


public class PermissionIdResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     * Site compatibility flag set for permission
     * Enum: Compatible, Incompatible, Independent
     */
    public String siteCompatible;

    public PermissionIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PermissionIdResource id(String id) {
        this.id = id;
        return this;
    }

    public PermissionIdResource siteCompatible(String siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

}
