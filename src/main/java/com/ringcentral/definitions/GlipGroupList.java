package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipGroupList
{
    // List of groups/teams/private chats
    public GlipGroupInfo[] records;
    public GlipGroupList records(GlipGroupInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public GlipNavigationInfo navigation;
    public GlipGroupList navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
