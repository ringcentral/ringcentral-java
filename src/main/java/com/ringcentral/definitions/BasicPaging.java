package com.ringcentral.definitions;

/** Paging information */
public class BasicPaging {
    /** Current offset token Required */
    public String currentPageToken;

    public BasicPaging currentPageToken(String currentPageToken) {
        this.currentPageToken = currentPageToken;
        return this;
    }

    /** Next page offset token */
    public String nextPageToken;

    public BasicPaging nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
}
