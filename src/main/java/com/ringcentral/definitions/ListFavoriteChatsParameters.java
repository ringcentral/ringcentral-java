package com.ringcentral.definitions;


public class ListFavoriteChatsParameters {
    /**
     * Max number of chats to be fetched by one request (Not more than 250).
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;

    public ListFavoriteChatsParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

}
