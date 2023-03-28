package com.ringcentral.definitions;


/**
 * Query parameters for operation listFavoriteChatsNew
 */
public class ListFavoriteChatsNewParameters {
    /**
     * Max number of chats to be fetched by one request (Not more than 250).
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;

    public ListFavoriteChatsNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
}
