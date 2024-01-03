package com.ringcentral.definitions;


public class TMTaskList {
    /**
     *
     */
    public TMTaskInfo[] records;
    /**
     *
     */
    public TMNavigationInfo navigation;

    public TMTaskList records(TMTaskInfo[] records) {
        this.records = records;
        return this;
    }

    public TMTaskList navigation(TMNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
