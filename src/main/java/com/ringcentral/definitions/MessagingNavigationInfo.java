package com.ringcentral.definitions;


public class MessagingNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public MessagingNavigationInfoURI firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public MessagingNavigationInfoURI nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public MessagingNavigationInfoURI previousPage;
    /**
     * Canonical URI for the last page of the list
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
