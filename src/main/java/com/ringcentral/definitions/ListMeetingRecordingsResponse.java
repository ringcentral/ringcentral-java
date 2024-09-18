package com.ringcentral.definitions;


public class ListMeetingRecordingsResponse {
    /**
     *
     */
    public MeetingRecordings[] records;
    /**
     *
     */
    public EnumeratedPagingModel paging;
    /**
     *
     */
    public PageNavigationModel navigation;

    public ListMeetingRecordingsResponse records(MeetingRecordings[] records) {
        this.records = records;
        return this;
    }

    public ListMeetingRecordingsResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    public ListMeetingRecordingsResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
