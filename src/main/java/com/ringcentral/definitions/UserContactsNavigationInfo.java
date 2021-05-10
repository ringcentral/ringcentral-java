package com.ringcentral.definitions;


// Information on navigation
public class UserContactsNavigationInfo {
    /**
     *
     */
    public UserContactsNavigationInfoUri firstPage;
    /**
     *
     */
    public UserContactsNavigationInfoUri nextPage;
    /**
     *
     */
    public UserContactsNavigationInfoUri previousPage;
    /**
     *
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
