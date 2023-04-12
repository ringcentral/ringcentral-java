package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwConfigListWebinars
 */
public class RcwConfigListWebinarsParameters {
    /**
     * The beginning of the time window by &#039;creationTime&#039; .
     * Format: date-time
     */
    public String creationTimeFrom;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    /**
     * The token indicating the particular page of the result set to be retrieved.
     * If omitted the first page will be returned.
     */
    public String pageToken;

    public RcwConfigListWebinarsParameters creationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }

    public RcwConfigListWebinarsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwConfigListWebinarsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}
