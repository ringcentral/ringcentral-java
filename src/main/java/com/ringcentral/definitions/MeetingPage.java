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
    public BasicPaging paging;

    public MeetingPage meetings(Meeting[] meetings) {
        this.meetings = meetings;
        return this;
    }

    public MeetingPage paging(BasicPaging paging) {
        this.paging = paging;
        return this;
    }
}
