package com.ringcentral.definitions;


public class AccountLockedSettingResponse {
    /**
     * Scheduling meeting settings locked on account level
     */
    public ScheduleUserMeetingInfo scheduleMeeting;
    /**
     * Meeting recording settings locked on account level
     */
    public UserMeetingRecordingSetting recording;

    public AccountLockedSettingResponse scheduleMeeting(ScheduleUserMeetingInfo scheduleMeeting) {
        this.scheduleMeeting = scheduleMeeting;
        return this;
    }

    public AccountLockedSettingResponse recording(UserMeetingRecordingSetting recording) {
        this.recording = recording;
        return this;
    }

}
