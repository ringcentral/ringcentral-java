package com.ringcentral.definitions;


/**
 * Query parameters for operation listRecentChatsNew
 */
public class ListRecentChatsNewParameters {
    /**
     * Type of chats to be fetched. By default all chat types are returned
     * Enum: Everyone, Group, Personal, Direct, Team
     */
    public String[] type;
    /**
     * Max number of chats to be fetched by one request (Not more than 250).
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;

    public ListRecentChatsNewParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public ListRecentChatsNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
}
