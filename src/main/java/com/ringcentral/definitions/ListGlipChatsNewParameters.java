package com.ringcentral.definitions;


/**
 * Query parameters for operation listGlipChatsNew
 */
public class ListGlipChatsNewParameters {
    /**
     * Type of chats to be fetched. By default, all type of chats will be fetched
     * Enum: Personal, Direct, Group, Team, Everyone
     */
    public String[] type;
    /**
     * Number of chats to be fetched by one request. The maximum value is 250, by default - 30.
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;
    /**
     * Pagination token.
     */
    public String pageToken;

    public ListGlipChatsNewParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ListGlipChatsNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ListGlipChatsNewParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}
