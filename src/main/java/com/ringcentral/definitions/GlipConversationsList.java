package com.ringcentral.definitions;


public class GlipConversationsList {
    /**
     * List of conversations
     * Required
     */
    public GlipConversationInfo[] records;
    /**
     *
     */
    public GlipNavigationInfo navigation;

    public GlipConversationsList records(GlipConversationInfo[] records) {
        this.records = records;
        return this;
    }

    public GlipConversationsList navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
