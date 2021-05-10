package com.ringcentral.definitions;


public class AccountLockedSettingResponse {
    /**
     *
     */
    public ScheduleUserMeetingInfo scheduleMeeting;
    /**
     *
     */
    public UserMeetingRecordingSetting recording;
    /**
     *
     */
    public TelephonyLockedSettings telephony;

    public AccountLockedSettingResponse scheduleMeeting(ScheduleUserMeetingInfo scheduleMeeting) {
        this.scheduleMeeting = scheduleMeeting;
        return this;
    }

    public AccountLockedSettingResponse recording(UserMeetingRecordingSetting recording) {
        this.recording = recording;
        return this;
    }

    public AccountLockedSettingResponse telephony(TelephonyLockedSettings telephony) {
        this.telephony = telephony;
        return this;
    }
}
