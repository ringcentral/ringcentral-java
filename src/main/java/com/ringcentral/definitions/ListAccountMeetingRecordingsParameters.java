package com.ringcentral.definitions;


/**
 * Query parameters for operation listAccountMeetingRecordings
 */
public class ListAccountMeetingRecordingsParameters {
    /**
     * Internal identifier of a meeting. Either `meetingId` or `meetingStartTime`/`meetingEndTime` can be specified
     */
    public String meetingId;
    /**
     * Recordings of meetings in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format started after the time specified will be returned, for example *2016-03-10T18:07:52.534Z*. Either `meetingId` or `meetingStartTime`/`meetingEndTime` can be specified
     */
    public String meetingStartTimeFrom;
    /**
     * Recordings of meetings in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format started before the time specified will be returned, for example *2016-03-10T18:07:52.534Z*. The default value is current time. Either `meetingId` or `meetingStartTime`/`meetingEndTime` can be specified
     */
    public String meetingStartTimeTo;
    /**
     * Page number
     */
    public Long page;
    /**
     * Number of items per page. The `max` value is supported to indicate the maximum size - 300
     * Maximum: 300
     * Default: 100
     */
    public Long perPage;

    public ListAccountMeetingRecordingsParameters meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }

    public ListAccountMeetingRecordingsParameters meetingStartTimeFrom(String meetingStartTimeFrom) {
        this.meetingStartTimeFrom = meetingStartTimeFrom;
        return this;
    }

    public ListAccountMeetingRecordingsParameters meetingStartTimeTo(String meetingStartTimeTo) {
        this.meetingStartTimeTo = meetingStartTimeTo;
        return this;
    }

    public ListAccountMeetingRecordingsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListAccountMeetingRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
