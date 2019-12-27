package com.ringcentral.definitions;


public class ListMeetingRecordingsResponse {
    /**
     *
     */
    public MeetingRecordings[] records;
    /**
     *
     */
    public MeetingRecordingsPagingInfo paging;
    /**
     *
     */
    public MeetingRecordingsNavigationInfo navigation;

    public ListMeetingRecordingsResponse records(MeetingRecordings[] records) {
        this.records = records;
        return this;
    }

    public ListMeetingRecordingsResponse paging(MeetingRecordingsPagingInfo paging) {
        this.paging = paging;
        return this;
    }

    public ListMeetingRecordingsResponse navigation(MeetingRecordingsNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
