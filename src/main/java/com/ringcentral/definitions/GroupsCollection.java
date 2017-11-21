package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GroupsCollection
{
    //
    public String uri;
    public GroupsCollection uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public GroupResource[] records;
    public GroupsCollection records(GroupResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public GroupsCollection paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public GroupsCollection navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
