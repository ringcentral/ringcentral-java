package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AddressBookResource
{
    //
    public String uri;
    public AddressBookResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ResourceLink contacts;
    public AddressBookResource contacts(ResourceLink contacts) {
        this.contacts = contacts;
        return this;
    }
    //
    public ResourceLink groups;
    public AddressBookResource groups(ResourceLink groups) {
        this.groups = groups;
        return this;
    }
}
