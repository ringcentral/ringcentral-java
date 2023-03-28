package com.ringcentral.definitions;


/**
 * Query parameters for operation readGlipPostsNew
 */
public class ReadGlipPostsNewParameters {
    /**
     * Max number of posts to be fetched by one request (not more than 250).
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;
    /**
     * Pagination token.
     */
    public String pageToken;

    public ReadGlipPostsNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ReadGlipPostsNewParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}
