package com.ringcentral.definitions;


public class MeetingsNavigationInfo {
    /**
     *
     */
    public MeetingsNavigationInfoUri nextPage;
    /**
     *
     */
    public MeetingsNavigationInfoUri previousPage;
    /**
     *
     */
    public MeetingsNavigationInfoUri firstPage;
    /**
     *
     */
    public MeetingsNavigationInfoUri lastPage;

    public MeetingsNavigationInfo nextPage(MeetingsNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public MeetingsNavigationInfo previousPage(MeetingsNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public MeetingsNavigationInfo firstPage(MeetingsNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public MeetingsNavigationInfo lastPage(MeetingsNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }

}
