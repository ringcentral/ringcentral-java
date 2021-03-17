package com.ringcentral.definitions;


public class MeetingUserSettingsResponse
{
    /**
         */
        public UserMeetingRecordingSetting recording;
  public MeetingUserSettingsResponse recording(UserMeetingRecordingSetting recording)
  {
    this.recording = recording;
    return this;
  }
  

        /**
         */
        public ScheduleUserMeetingInfo scheduleMeeting;
  public MeetingUserSettingsResponse scheduleMeeting(ScheduleUserMeetingInfo scheduleMeeting)
  {
    this.scheduleMeeting = scheduleMeeting;
    return this;
  }
  

        /**
         */
        public TelephonyUserMeetingSettings telephony;
  public MeetingUserSettingsResponse telephony(TelephonyUserMeetingSettings telephony)
  {
    this.telephony = telephony;
    return this;
  }
  
}
