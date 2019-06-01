package com.ringcentral.definitions;


public class UserContactsNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public UserContactsNavigationInfoUri firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public UserContactsNavigationInfoUri nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public UserContactsNavigationInfoUri previousPage;
    /**
     * Canonical URI for the last page of the list
     */
    public UserContactsNavigationInfoUri lastPage;

    public UserContactsNavigationInfo firstPage(UserContactsNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public UserContactsNavigationInfo nextPage(UserContactsNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public UserContactsNavigationInfo previousPage(UserContactsNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public UserContactsNavigationInfo lastPage(UserContactsNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }

}
