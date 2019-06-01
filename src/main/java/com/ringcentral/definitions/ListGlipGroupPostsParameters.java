package com.ringcentral.definitions;


public class ListGlipGroupPostsParameters {
    /**
     * Max number of records to be returned
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;
    /**
     * Pagination token
     */
    public String pageToken;

    public ListGlipGroupPostsParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ListGlipGroupPostsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

}
