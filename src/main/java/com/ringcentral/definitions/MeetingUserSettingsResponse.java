package com.ringcentral.definitions;


public class MeetingUserSettingsResponse {
    /**
     *
     */
    public UserMeetingRecordingSetting recording;
    /**
     *
     */
    public ScheduleUserMeetingInfo scheduleMeeting;
    /**
     *
     */
    public TelephonyUserMeetingSettings telephony;
    /**
     *
     */
    public UserInMeetingResponse inMeetings;

    public MeetingUserSettingsResponse recording(UserMeetingRecordingSetting recording) {
        this.recording = recording;
        return this;
    }

    public MeetingUserSettingsResponse scheduleMeeting(ScheduleUserMeetingInfo scheduleMeeting) {
        this.scheduleMeeting = scheduleMeeting;
        return this;
    }

    public MeetingUserSettingsResponse telephony(TelephonyUserMeetingSettings telephony) {
        this.telephony = telephony;
        return this;
    }

    public MeetingUserSettingsResponse inMeetings(UserInMeetingResponse inMeetings) {
        this.inMeetings = inMeetings;
        return this;
    }
}
