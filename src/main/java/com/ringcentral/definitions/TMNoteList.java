package com.ringcentral.definitions;


public class TMNoteList
{
    /**
     */
    public TMNoteInfo[] records;
    public TMNoteList records(TMNoteInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public TMNavigationInfo navigation;
    public TMNoteList navigation(TMNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }
}