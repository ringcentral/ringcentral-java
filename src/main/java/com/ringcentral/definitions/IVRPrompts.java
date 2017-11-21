package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class IVRPrompts
{
    // Link to prompts library resource
    public String uri;
    public IVRPrompts uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of Prompts
    public PromptInfo[] records;
    public IVRPrompts records(PromptInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public IVRPrompts navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public IVRPrompts paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
