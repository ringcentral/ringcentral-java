package com.ringcentral.definitions;


public class GlipPreferencesChats {
    /**
     * Default: 10
     */
    public Long maxCount;
    /**
     * Default: CombineAllChatTypes
     * Enum: SeparateAllChatTypes, SeparateConversationsAndTeams, CombineAllChatTypes
     */
    public String leftRailMode;

    public GlipPreferencesChats maxCount(Long maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    public GlipPreferencesChats leftRailMode(String leftRailMode) {
        this.leftRailMode = leftRailMode;
        return this;
    }

}
