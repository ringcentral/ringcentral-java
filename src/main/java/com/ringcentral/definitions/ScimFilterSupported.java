package com.ringcentral.definitions;


public class ScimFilterSupported {
    /**
     * Format: int32
     */
    public Long maxResults;
    /**
     *
     */
    public Boolean supported;

    public ScimFilterSupported maxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    public ScimFilterSupported supported(Boolean supported) {
        this.supported = supported;
        return this;
    }
}
