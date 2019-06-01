package com.ringcentral.definitions;


public class PresenceNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public PresenceNavigationInfoURI firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public PresenceNavigationInfoURI nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public PresenceNavigationInfoURI previousPage;
    /**
     * Canonical URI for the last page of the list
     */
    public PresenceNavigationInfoURI lastPage;

    public PresenceNavigationInfo firstPage(PresenceNavigationInfoURI firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public PresenceNavigationInfo nextPage(PresenceNavigationInfoURI nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public PresenceNavigationInfo previousPage(PresenceNavigationInfoURI previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public PresenceNavigationInfo lastPage(PresenceNavigationInfoURI lastPage) {
        this.lastPage = lastPage;
        return this;
    }

}
