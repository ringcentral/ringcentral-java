package com.ringcentral.definitions;


public class ListGlipChatsParameters {
    /**
     * Type of chats to be fetched. By default all type of chats will be fetched
     */
    public String[] type;
    /**
     * Number of chats to be fetched by one request. The maximum value is 250, by default - 30.
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;
    /**
     * Pagination token.
     */
    public String pageToken;

    public ListGlipChatsParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ListGlipChatsParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ListGlipChatsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

}
