package com.ringcentral.definitions;


/**
 * Information on navigation
 */
public class CallHandlingNavigationInfo {
    /**
     *
     */
    public CallHandlingNavigationInfoUri firstPage;
    /**
     *
     */
    public CallHandlingNavigationInfoUri nextPage;
    /**
     *
     */
    public CallHandlingNavigationInfoUri previousPage;
    /**
     *
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
