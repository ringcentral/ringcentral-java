package com.ringcentral.definitions;


/**
 * Links to other pages of the current result set
 */
public class PageNavigationModel {
    /**
     *
     */
    public PageNavigationUri firstPage;
    /**
     *
     */
    public PageNavigationUri nextPage;
    /**
     *
     */
    public PageNavigationUri previousPage;
    /**
     *
     */
    public PageNavigationUri lastPage;

    public PageNavigationModel firstPage(PageNavigationUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public PageNavigationModel nextPage(PageNavigationUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public PageNavigationModel previousPage(PageNavigationUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public PageNavigationModel lastPage(PageNavigationUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
