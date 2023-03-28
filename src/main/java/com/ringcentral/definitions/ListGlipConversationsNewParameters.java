package com.ringcentral.definitions;


/**
 * Query parameters for operation listGlipConversationsNew
 */
public class ListGlipConversationsNewParameters {
    /**
     * Number of conversations to be fetched by one request. The maximum value is 250, by default - 30
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;
    /**
     * Pagination token.
     */
    public String pageToken;

    public ListGlipConversationsNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ListGlipConversationsNewParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}
