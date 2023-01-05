package com.ringcentral.definitions;


public class MeetingsNavigationInfo
{
    /**
     */
    public MeetingsNavigationInfoUri nextPage;
    public MeetingsNavigationInfo nextPage(MeetingsNavigationInfoUri nextPage)
    {
        this.nextPage = nextPage;
        return this;
    }

    /**
     */
    public MeetingsNavigationInfoUri previousPage;
    public MeetingsNavigationInfo previousPage(MeetingsNavigationInfoUri previousPage)
    {
        this.previousPage = previousPage;
        return this;
    }

    /**
     */
    public MeetingsNavigationInfoUri firstPage;
    public MeetingsNavigationInfo firstPage(MeetingsNavigationInfoUri firstPage)
    {
        this.firstPage = firstPage;
        return this;
    }

    /**
     */
    public MeetingsNavigationInfoUri lastPage;
    public MeetingsNavigationInfo lastPage(MeetingsNavigationInfoUri lastPage)
    {
        this.lastPage = lastPage;
        return this;
    }
}