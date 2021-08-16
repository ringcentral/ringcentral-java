package com.ringcentral.definitions;


public class RNPNavigationInfo {
    /**
     *
     */
    public RNPNavigationInfoUri nextPage;
    /**
     *
     */
    public RNPNavigationInfoUri previousPage;
    /**
     *
     */
    public RNPNavigationInfoUri firstPage;
    /**
     *
     */
    public RNPNavigationInfoUri lastPage;

    public RNPNavigationInfo nextPage(RNPNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public RNPNavigationInfo previousPage(RNPNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public RNPNavigationInfo firstPage(RNPNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public RNPNavigationInfo lastPage(RNPNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
