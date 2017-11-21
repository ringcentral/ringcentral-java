package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GroupContactsCollection
{
    //
    public String uri;
    public GroupContactsCollection uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PersonalContactResource[] records;
    public GroupContactsCollection records(PersonalContactResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public GroupContactsCollection paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public GroupContactsCollection navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
