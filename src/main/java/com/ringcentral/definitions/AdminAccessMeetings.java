package com.ringcentral.definitions;

/** Meetings page */
public class AdminAccessMeetings {
    /** Meetings array Required */
    public AdminAccessMeeting[] meetings;

    public AdminAccessMeetings meetings(AdminAccessMeeting[] meetings) {
        this.meetings = meetings;
        return this;
    }

    /** Required */
    public Paging paging;

    public AdminAccessMeetings paging(Paging paging) {
        this.paging = paging;
        return this;
    }
}
