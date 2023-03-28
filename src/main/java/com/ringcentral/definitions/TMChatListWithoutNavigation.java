package com.ringcentral.definitions;


public class TMChatListWithoutNavigation {
    /**
     * List of chats
     * Required
     */
    public TMChatInfo[] records;

    public TMChatListWithoutNavigation records(TMChatInfo[] records) {
        this.records = records;
        return this;
    }
}
