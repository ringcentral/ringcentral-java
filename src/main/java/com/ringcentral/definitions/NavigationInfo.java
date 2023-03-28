package com.ringcentral.definitions;


public class NavigationInfo {
    /**
     *
     */
    public NavigationUri firstPage;
    /**
     *
     */
    public NavigationUri nextPage;
    /**
     *
     */
    public NavigationUri previousPage;
    /**
     *
     */
    public NavigationUri lastPage;

    public NavigationInfo firstPage(NavigationUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public NavigationInfo nextPage(NavigationUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public NavigationInfo previousPage(NavigationUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public NavigationInfo lastPage(NavigationUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
