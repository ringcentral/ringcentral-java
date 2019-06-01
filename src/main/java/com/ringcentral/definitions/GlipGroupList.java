package com.ringcentral.definitions;


public class GlipGroupList {
    /**
     * List of groups/teams/private chats
     * Required
     */
    public GlipGroupInfo[] records;
    /**
     *
     */
    public GlipNavigationInfo navigation;

    public GlipGroupList records(GlipGroupInfo[] records) {
        this.records = records;
        return this;
    }

    public GlipGroupList navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
