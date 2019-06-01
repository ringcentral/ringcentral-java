package com.ringcentral.definitions;


public class ReadGlipPostsParameters {
    /**
     * Max number of posts to be fetched by one request (Not more than 250).
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;
    /**
     * Pagination token.
     */
    public String pageToken;

    public ReadGlipPostsParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ReadGlipPostsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

}
