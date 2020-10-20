package com.ringcentral.definitions;


// Pagination details
public class PagingResource {
    /**
     * Page token of the current response list
     */
    public String pageToken;
    /**
     * Number of records per page
     * Default: 1000
     */
    public Long perPage;
    /**
     * First page token of the current filter criteria
     */
    public String firstPageToken;
    /**
     * Previous page token of the current filter criteria
     */
    public String previousPageToken;
    /**
     * Next page token of the current filter criteria
     */
    public String nextPageToken;

    public PagingResource pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public PagingResource perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public PagingResource firstPageToken(String firstPageToken) {
        this.firstPageToken = firstPageToken;
        return this;
    }

    public PagingResource previousPageToken(String previousPageToken) {
        this.previousPageToken = previousPageToken;
        return this;
    }

    public PagingResource nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

}
