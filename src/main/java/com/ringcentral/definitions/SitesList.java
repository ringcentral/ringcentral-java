package com.ringcentral.definitions;


public class SitesList {
    /**
     * Link to a sites resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public SiteInfo[] records;

    public SitesList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SitesList records(SiteInfo[] records) {
        this.records = records;
        return this;
    }
}
