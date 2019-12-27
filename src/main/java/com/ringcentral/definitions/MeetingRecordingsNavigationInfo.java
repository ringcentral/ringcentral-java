package com.ringcentral.definitions;


public class MeetingRecordingsNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public MeetingRecordingsNavigationInfoUri firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public MeetingRecordingsNavigationInfoUri nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public MeetingRecordingsNavigationInfoUri previousPage;
    /**
     * Canonical URI for the last page of the list
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
