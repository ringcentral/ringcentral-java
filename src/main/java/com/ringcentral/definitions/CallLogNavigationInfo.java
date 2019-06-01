package com.ringcentral.definitions;


public class CallLogNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public CallLogNavigationInfoURI firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public CallLogNavigationInfoURI nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public CallLogNavigationInfoURI previousPage;
    /**
     * Canonical URI for the last page of the list
     */
    public CallLogNavigationInfoURI lastPage;

    public CallLogNavigationInfo firstPage(CallLogNavigationInfoURI firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public CallLogNavigationInfo nextPage(CallLogNavigationInfoURI nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public CallLogNavigationInfo previousPage(CallLogNavigationInfoURI previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public CallLogNavigationInfo lastPage(CallLogNavigationInfoURI lastPage) {
        this.lastPage = lastPage;
        return this;
    }

}
