package com.ringcentral.definitions;


/**
 * Meetings page
 */
public class MeetingPage {
    /**
     * Meetings array
     * Required
     */
    public Meeting[] meetings;
    /**
     * Required
     */
    public Paging paging;

    public MeetingPage meetings(Meeting[] meetings) {
        this.meetings = meetings;
        return this;
    }

    public MeetingPage paging(Paging paging) {
        this.paging = paging;
        return this;
    }
}
