package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ContactList
{
    // List of personal contacts from the extension address book
    public PersonalContactResource[] records;
    public ContactList records(PersonalContactResource[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public ContactList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public ContactList paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
