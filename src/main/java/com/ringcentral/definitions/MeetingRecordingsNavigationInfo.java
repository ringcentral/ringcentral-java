package com.ringcentral.definitions;


public class MeetingRecordingsNavigationInfo {
    /**
     *
     */
    public MeetingRecordingsNavigationInfoUri firstPage;
    /**
     *
     */
    public MeetingRecordingsNavigationInfoUri nextPage;
    /**
     *
     */
    public MeetingRecordingsNavigationInfoUri previousPage;
    /**
     *
     */
    public MeetingRecordingsNavigationInfoUri lastPage;

    public MeetingRecordingsNavigationInfo firstPage(MeetingRecordingsNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public MeetingRecordingsNavigationInfo nextPage(MeetingRecordingsNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public MeetingRecordingsNavigationInfo previousPage(MeetingRecordingsNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public MeetingRecordingsNavigationInfo lastPage(MeetingRecordingsNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
