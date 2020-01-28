package com.ringcentral.definitions;


public class ContactList {
    /**
     * link to the list of user personal contacts
     */
    public String uri;
    /**
     * List of personal contacts from the extension address book
     */
    public PersonalContactResource[] records;
    /**
     * Information on navigation
     */
    public UserContactsNavigationInfo navigation;
    /**
     * Information on paging
     */
    public UserContactsPagingInfo paging;
    /**
     * Information on address book groups
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
