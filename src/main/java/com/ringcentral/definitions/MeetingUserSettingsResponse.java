package com.ringcentral.definitions;


public class MeetingUserSettingsResponse {
    /**
     *
     */
    public UserMeetingRecordingSetting recording;
    /**
     * Settings defining how to schedule user meetings
     */
    public ScheduleUserMeetingInfo scheduleMeeting;

    public MeetingUserSettingsResponse recording(UserMeetingRecordingSetting recording) {
        this.recording = recording;
        return this;
    }

    public MeetingUserSettingsResponse scheduleMeeting(ScheduleUserMeetingInfo scheduleMeeting) {
        this.scheduleMeeting = scheduleMeeting;
        return this;
    }

}
