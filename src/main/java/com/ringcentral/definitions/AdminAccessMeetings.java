package com.ringcentral.definitions;


/**
 * Meetings page
 */
public class AdminAccessMeetings {
    /**
     * Meetings array
     * Required
     */
    public AdminAccessMeeting[] meetings;
    /**
     * Required
     */
    public Paging paging;

    public AdminAccessMeetings meetings(AdminAccessMeeting[] meetings) {
        this.meetings = meetings;
        return this;
    }

    public AdminAccessMeetings paging(Paging paging) {
        this.paging = paging;
        return this;
    }
}
