package com.ringcentral.definitions;


public class PageNavigationUri {
    /**
     * Canonical URI to retrieve the particular page of the result set
     * Format: uri
     */
    public String uri;

    public PageNavigationUri uri(String uri) {
        this.uri = uri;
        return this;
    }
}
