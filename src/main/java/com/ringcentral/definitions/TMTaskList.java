package com.ringcentral.definitions;


public class TMTaskList
{
    /**
     */
    public TMTaskInfo[] records;
    public TMTaskList records(TMTaskInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public TMNavigationInfo navigation;
    public TMTaskList navigation(TMNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }
}