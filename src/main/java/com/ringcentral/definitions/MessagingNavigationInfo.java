package com.ringcentral.definitions;


// Information on navigation
public class MessagingNavigationInfo {
    /**
     *
     */
    public MessagingNavigationInfoURI firstPage;
    /**
     *
     */
    public MessagingNavigationInfoURI nextPage;
    /**
     *
     */
    public MessagingNavigationInfoURI previousPage;
    /**
     *
     */
    public MessagingNavigationInfoURI lastPage;

    public MessagingNavigationInfo firstPage(MessagingNavigationInfoURI firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public MessagingNavigationInfo nextPage(MessagingNavigationInfoURI nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public MessagingNavigationInfo previousPage(MessagingNavigationInfoURI previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public MessagingNavigationInfo lastPage(MessagingNavigationInfoURI lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
