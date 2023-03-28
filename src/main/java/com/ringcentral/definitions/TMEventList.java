package com.ringcentral.definitions;


public class TMEventList {
    /**
     * List of events created by the current user
     */
    public TMEventInfo[] records;
    /**
     *
     */
    public TMNavigationInfo navigation;

    public TMEventList records(TMEventInfo[] records) {
        this.records = records;
        return this;
    }

    public TMEventList navigation(TMNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
