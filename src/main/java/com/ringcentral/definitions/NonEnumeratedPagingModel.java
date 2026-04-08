package com.ringcentral.definitions;

public class NonEnumeratedPagingModel {
    /**
     * Current page size, describes how many items are in each page. Matches &quot;perPage&quot;
     * parameter from the request. Required Maximum: 1000 Minimum: 1 Format: int32 Example: 50
     */
    public Long perPage;

    public NonEnumeratedPagingModel perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * Current page token. May be omitted if result is empty (because non-existent page was
     * specified or perPage=0 was requested)
     */
    public String pageToken;

    public NonEnumeratedPagingModel pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * A page token to be used to fetch the next page of the result set. May be omitted if the
     * current page is the last one.
     */
    public String nextPageToken;

    public NonEnumeratedPagingModel nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * A page token to be used to fetch the previous page of the result set. May be omitted if the
     * current page is the first one or if the result set does not support backward navigation.
     */
    public String previousPageToken;

    public NonEnumeratedPagingModel previousPageToken(String previousPageToken) {
        this.previousPageToken = previousPageToken;
        return this;
    }

    /** A page token to be used to fetch the first page of the result set. */
    public String firstPageToken;

    public NonEnumeratedPagingModel firstPageToken(String firstPageToken) {
        this.firstPageToken = firstPageToken;
        return this;
    }
}
