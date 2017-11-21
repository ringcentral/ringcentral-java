package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountPresenceInfo
{
    // Canonical URI of account presence resource
    public String uri;
    public AccountPresenceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of Prompts
    public GetPresenceInfo[] records;
    public AccountPresenceInfo records(GetPresenceInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public AccountPresenceInfo navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public AccountPresenceInfo paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
