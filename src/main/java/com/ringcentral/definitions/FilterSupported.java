package com.ringcentral.definitions;


public class FilterSupported {
    /**
     * Format: int32
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
