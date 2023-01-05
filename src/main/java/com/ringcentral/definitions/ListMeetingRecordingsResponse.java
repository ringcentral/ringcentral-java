package com.ringcentral.definitions;


public class ListMeetingRecordingsResponse
{
    /**
     */
    public MeetingRecordings[] records;
    public ListMeetingRecordingsResponse records(MeetingRecordings[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public MeetingRecordingsPagingInfo paging;
    public ListMeetingRecordingsResponse paging(MeetingRecordingsPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public MeetingRecordingsNavigationInfo navigation;
    public ListMeetingRecordingsResponse navigation(MeetingRecordingsNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }
}