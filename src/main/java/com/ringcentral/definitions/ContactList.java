package com.ringcentral.definitions;


public class ContactList {
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

}
