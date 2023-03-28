package com.ringcentral.definitions;


/**
 * Meetings page
 */
public class MeetingPage {
    /**
     * meetings array
     */
    public Meeting[] meetings;
    /**
     *
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
