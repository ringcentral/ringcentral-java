package com.ringcentral.definitions;


public class TMConversationList {
    /**
     * List of conversations
     * Required
     */
    public TMConversationInfo[] records;
    /**
     *
     */
    public TMNavigationInfo navigation;

    public TMConversationList records(TMConversationInfo[] records) {
        this.records = records;
        return this;
    }

    public TMConversationList navigation(TMNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
