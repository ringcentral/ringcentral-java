package com.ringcentral.definitions;


public class SiteReference {
    /**
     * Internal identifier of a site
     */
    public String id;

    public SiteReference id(String id) {
        this.id = id;
        return this;
    }
}
