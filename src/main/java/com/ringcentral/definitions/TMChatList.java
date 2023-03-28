package com.ringcentral.definitions;


public class TMChatList {
    /**
     * List of chats
     * Required
     */
    public TMChatInfo[] records;
    /**
     *
     */
    public TMNavigationInfo navigation;

    public TMChatList records(TMChatInfo[] records) {
        this.records = records;
        return this;
    }

    public TMChatList navigation(TMNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
