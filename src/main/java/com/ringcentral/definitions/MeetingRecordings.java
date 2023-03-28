package com.ringcentral.definitions;


public class MeetingRecordings {
    /**
     *
     */
    public MeetingInfo meeting;
    /**
     *
     */
    public MeetingRecordingInfo[] recordings;

    public MeetingRecordings meeting(MeetingInfo meeting) {
        this.meeting = meeting;
        return this;
    }

    public MeetingRecordings recordings(MeetingRecordingInfo[] recordings) {
        this.recordings = recordings;
        return this;
    }
}
