package com.ringcentral.definitions;


public class MeetingRecording {
    /**
     *
     */
    public MeetingInfo meeting;
    /**
     *
     */
    public MeetingRecordingInfo[] recording;

    public MeetingRecording meeting(MeetingInfo meeting) {
        this.meeting = meeting;
        return this;
    }

    public MeetingRecording recording(MeetingRecordingInfo[] recording) {
        this.recording = recording;
        return this;
    }

}
