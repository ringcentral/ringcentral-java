package com.ringcentral.definitions;


public class GlipChatsList {
    /**
     * List of chats
     * Required
     */
    public GlipChatInfo[] records;
    /**
     *
     */
    public GlipNavigationInfo navigation;

    public GlipChatsList records(GlipChatInfo[] records) {
        this.records = records;
        return this;
    }

    public GlipChatsList navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
