package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PresenceLinesNavigationResource
{
    //
    public String uri;
    public PresenceLinesNavigationResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PresenceLineResource[] records;
    public PresenceLinesNavigationResource records(PresenceLineResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public PresenceLinesNavigationResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public PresenceLinesNavigationResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
