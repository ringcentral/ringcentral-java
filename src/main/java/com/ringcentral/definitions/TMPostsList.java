package com.ringcentral.definitions;


public class TMPostsList {
    /**
     * List of posts
     * Required
     */
    public TMPostInfo[] records;
    /**
     *
     */
    public TMNavigationInfo navigation;

    public TMPostsList records(TMPostInfo[] records) {
        this.records = records;
        return this;
    }

    public TMPostsList navigation(TMNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
