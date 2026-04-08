package com.ringcentral.definitions;


    /**
* Meetings page
*/
public class MeetingPage
{
    /**
     * Meetings array
     * Required
     */
    public Meeting[] meetings;
    public MeetingPage meetings(Meeting[] meetings)
    {
        this.meetings = meetings;
        return this;
    }

    /**
     * Required
     */
    public BasicPaging paging;
    public MeetingPage paging(BasicPaging paging)
    {
        this.paging = paging;
        return this;
    }
}