package com.ringcentral.definitions;


public class RcwPagingModel {
    /**
     * Number of items per page
     * Required
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     */
    public Long perPage;
    /**
     * Current page token
     * Required
     */
    public String pageToken;
    /**
     * Next page token (absent for the last page of the result set)
     */
    public String nextPageToken;
    /**
     * Previous page token (absent for the first page of the result set)
     */
    public String previousPageToken;

    public RcwPagingModel perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwPagingModel pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public RcwPagingModel nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    public RcwPagingModel previousPageToken(String previousPageToken) {
        this.previousPageToken = previousPageToken;
        return this;
    }
}
