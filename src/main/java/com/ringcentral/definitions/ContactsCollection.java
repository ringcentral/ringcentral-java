package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ContactsCollection
{
    //
    public String uri;
    public ContactsCollection uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PersonalContactResource[] records;
    public ContactsCollection records(PersonalContactResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public ContactsCollection paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public ContactsCollection navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
    //
    public ResourceLink groups;
    public ContactsCollection groups(ResourceLink groups) {
        this.groups = groups;
        return this;
    }
}
