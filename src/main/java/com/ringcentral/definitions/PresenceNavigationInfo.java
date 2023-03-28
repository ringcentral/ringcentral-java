package com.ringcentral.definitions;


/**
 * Information on navigation
 */
public class PresenceNavigationInfo {
    /**
     *
     */
    public PresenceNavigationInfoURI firstPage;
    /**
     *
     */
    public PresenceNavigationInfoURI nextPage;
    /**
     *
     */
    public PresenceNavigationInfoURI previousPage;
    /**
     *
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
