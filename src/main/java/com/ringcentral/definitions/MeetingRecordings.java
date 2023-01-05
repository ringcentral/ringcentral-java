package com.ringcentral.definitions;


public class MeetingRecordings
{
    /**
     */
    public MeetingInfo meeting;
    public MeetingRecordings meeting(MeetingInfo meeting)
    {
        this.meeting = meeting;
        return this;
    }

    /**
     */
    public MeetingRecordingInfo[] recordings;
    public MeetingRecordings recordings(MeetingRecordingInfo[] recordings)
    {
        this.recordings = recordings;
        return this;
    }
}