package com.ringcentral.definitions;


public class TMPreferencesInfoChats {
    /**
     * Format: int32
     */
    public Long maxCount;
    /**
     * Default: CombineAllChatTypes
     * Enum: SeparateAllChatTypes, SeparateConversationsAndTeams, CombineAllChatTypes
     */
    public String leftRailMode;

    public TMPreferencesInfoChats maxCount(Long maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    public TMPreferencesInfoChats leftRailMode(String leftRailMode) {
        this.leftRailMode = leftRailMode;
        return this;
    }
}
