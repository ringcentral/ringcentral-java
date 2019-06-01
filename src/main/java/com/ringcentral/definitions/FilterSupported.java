package com.ringcentral.definitions;


public class FilterSupported {
    /**
     *
     */
    public Long maxResults;
    /**
     *
     */
    public Boolean supported;

    public FilterSupported maxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public FilterSupported supported(Boolean supported) {
        this.supported = supported;
        return this;
    }

}
