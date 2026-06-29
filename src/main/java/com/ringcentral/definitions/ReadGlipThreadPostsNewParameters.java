package com.ringcentral.definitions;

/** Query parameters for operation readGlipThreadPostsNew */
public class ReadGlipThreadPostsNewParameters {
    /**
     * Max number of posts to be fetched by one request (not more than 250) Maximum: 250 Format:
     * int32 Default: 30
     */
    public Long recordCount;

    public ReadGlipThreadPostsNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    /** Pagination token. */
    public String pageToken;

    public ReadGlipThreadPostsNewParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}
