package com.ringcentral.definitions;


public class AccountLockedSettingResponse
{
    /**
         */
        public ScheduleUserMeetingInfo scheduleMeeting;
  public AccountLockedSettingResponse scheduleMeeting(ScheduleUserMeetingInfo scheduleMeeting)
  {
    this.scheduleMeeting = scheduleMeeting;
    return this;
  }
  

        /**
         */
        public UserMeetingRecordingSetting recording;
  public AccountLockedSettingResponse recording(UserMeetingRecordingSetting recording)
  {
    this.recording = recording;
    return this;
  }
  

        /**
         */
        public TelephonyLockedSettings telephony;
  public AccountLockedSettingResponse telephony(TelephonyLockedSettings telephony)
  {
    this.telephony = telephony;
    return this;
  }
  
}
