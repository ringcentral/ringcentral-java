package com.ringcentral.definitions;


/**
 * Query parameters for operation listUserMeetingRecordings
 */
public class ListUserMeetingRecordingsParameters {
    /**
     * Internal identifier of a meeting. Either `meetingId` or `meetingStartTime`/`meetingEndTime` can be specified
     */
    public String meetingId;
    /**
     * Recordings of meetings started after the time specified will be returned. Either `meetingId` or `meetingStartTime`/`meetingEndTime` can be specified
     * Format: date-time
     */
    public String meetingStartTimeFrom;
    /**
     * Recordings of meetings started before the time specified will be returned. The default value is current time. Either `meetingId` or `meetingStartTime`/`meetingEndTime` can be specified
     * Format: date-time
     */
    public String meetingStartTimeTo;
    /**
     * Page number
     * Format: int32
     */
    public Long page;
    /**
     * Number of items per page. The `max` value is supported to indicate the maximum size - 300
     * Maximum: 300
     * Format: int32
     * Default: 100
     */
    public Long perPage;

    public ListUserMeetingRecordingsParameters meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }

    public ListUserMeetingRecordingsParameters meetingStartTimeFrom(String meetingStartTimeFrom) {
        this.meetingStartTimeFrom = meetingStartTimeFrom;
        return this;
    }

    public ListUserMeetingRecordingsParameters meetingStartTimeTo(String meetingStartTimeTo) {
        this.meetingStartTimeTo = meetingStartTimeTo;
        return this;
    }

    public ListUserMeetingRecordingsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListUserMeetingRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
