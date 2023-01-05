package com.ringcentral.definitions;


public class AccountLockSettingRecordResponse
{
    /**
     */
    public Boolean localRecording;
    public AccountLockSettingRecordResponse localRecording(Boolean localRecording)
    {
        this.localRecording = localRecording;
        return this;
    }

    /**
     */
    public Boolean cloudRecording;
    public AccountLockSettingRecordResponse cloudRecording(Boolean cloudRecording)
    {
        this.cloudRecording = cloudRecording;
        return this;
    }

    /**
     */
    public Boolean autoRecording;
    public AccountLockSettingRecordResponse autoRecording(Boolean autoRecording)
    {
        this.autoRecording = autoRecording;
        return this;
    }

    /**
     */
    public Boolean cloudRecordingDownload;
    public AccountLockSettingRecordResponse cloudRecordingDownload(Boolean cloudRecordingDownload)
    {
        this.cloudRecordingDownload = cloudRecordingDownload;
        return this;
    }

    /**
     */
    public Boolean hostDeleteCloudRecording;
    public AccountLockSettingRecordResponse hostDeleteCloudRecording(Boolean hostDeleteCloudRecording)
    {
        this.hostDeleteCloudRecording = hostDeleteCloudRecording;
        return this;
    }

    /**
     */
    public Boolean accountUserAccessRecording;
    public AccountLockSettingRecordResponse accountUserAccessRecording(Boolean accountUserAccessRecording)
    {
        this.accountUserAccessRecording = accountUserAccessRecording;
        return this;
    }

    /**
     */
    public Boolean autoDeleteCmr;
    public AccountLockSettingRecordResponse autoDeleteCmr(Boolean autoDeleteCmr)
    {
        this.autoDeleteCmr = autoDeleteCmr;
        return this;
    }
}