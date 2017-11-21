package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GroupResource
{
    //
    public String uri;
    public GroupResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ResourceLink contacts;
    public GroupResource contacts(ResourceLink contacts) {
        this.contacts = contacts;
        return this;
    }
    //
    public String id;
    public GroupResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String notes;
    public GroupResource notes(String notes) {
        this.notes = notes;
        return this;
    }
    //
    public String groupName;
    public GroupResource groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    //
    public Long contactsCount;
    public GroupResource contactsCount(Long contactsCount) {
        this.contactsCount = contactsCount;
        return this;
    }
}
