package com.ringcentral.definitions;


public class AccountLockedSettingResponse
{
    /**
     */
    public ScheduleMeetingResponse scheduleMeeting;
    public AccountLockedSettingResponse scheduleMeeting(ScheduleMeetingResponse scheduleMeeting)
    {
        this.scheduleMeeting = scheduleMeeting;
        return this;
    }

    /**
     */
    public AccountLockSettingRecordResponse recording;
    public AccountLockedSettingResponse recording(AccountLockSettingRecordResponse recording)
    {
        this.recording = recording;
        return this;
    }
}