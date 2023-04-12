package com.ringcentral.definitions;


public class SwitchesList {
    /**
     * Switches map
     */
    public SwitchInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public SwitchesList records(SwitchInfo[] records) {
        this.records = records;
        return this;
    }

    public SwitchesList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public SwitchesList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
