package com.ringcentral.definitions;


/**
 * Paging
 */
public class Paging {
    /**
     * current offset token
     */
    public String currentPageToken;
    /**
     * next page offset token
     */
    public String nextPageToken;

    public Paging currentPageToken(String currentPageToken) {
        this.currentPageToken = currentPageToken;
        return this;
    }

    public Paging nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
}
