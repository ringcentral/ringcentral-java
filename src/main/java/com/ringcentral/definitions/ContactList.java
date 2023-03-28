package com.ringcentral.definitions;


public class ContactList {
    /**
     * Link to the list of user personal contacts
     * Format: uri
     */
    public String uri;
    /**
     * List of personal contacts from the extension address book
     */
    public PersonalContactResource[] records;
    /**
     *
     */
    public UserContactsNavigationInfo navigation;
    /**
     *
     */
    public UserContactsPagingInfo paging;
    /**
     *
     */
    public UserContactsGroupsInfo groups;

    public ContactList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ContactList records(PersonalContactResource[] records) {
        this.records = records;
        return this;
    }

    public ContactList navigation(UserContactsNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public ContactList paging(UserContactsPagingInfo paging) {
        this.paging = paging;
        return this;
    }

    public ContactList groups(UserContactsGroupsInfo groups) {
        this.groups = groups;
        return this;
    }
}
