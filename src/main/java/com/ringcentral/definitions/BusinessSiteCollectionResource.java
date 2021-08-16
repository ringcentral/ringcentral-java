package com.ringcentral.definitions;


public class BusinessSiteCollectionResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public RolesBusinessSiteResource[] records;

    public BusinessSiteCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public BusinessSiteCollectionResource records(RolesBusinessSiteResource[] records) {
        this.records = records;
        return this;
    }
}
