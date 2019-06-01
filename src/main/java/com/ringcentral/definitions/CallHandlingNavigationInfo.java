package com.ringcentral.definitions;


public class CallHandlingNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public CallHandlingNavigationInfoUri firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public CallHandlingNavigationInfoUri nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public CallHandlingNavigationInfoUri previousPage;
    /**
     * Canonical URI for the last page of the list
     */
    public CallHandlingNavigationInfoUri lastPage;

    public CallHandlingNavigationInfo firstPage(CallHandlingNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public CallHandlingNavigationInfo nextPage(CallHandlingNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public CallHandlingNavigationInfo previousPage(CallHandlingNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public CallHandlingNavigationInfo lastPage(CallHandlingNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }

}
