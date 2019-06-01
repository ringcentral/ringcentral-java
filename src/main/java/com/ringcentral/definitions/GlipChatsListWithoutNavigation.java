package com.ringcentral.definitions;


public class GlipChatsListWithoutNavigation {
    /**
     * List of chats
     * Required
     */
    public GlipChatInfo[] records;

    public GlipChatsListWithoutNavigation records(GlipChatInfo[] records) {
        this.records = records;
        return this;
    }

}
