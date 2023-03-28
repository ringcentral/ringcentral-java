package com.ringcentral.definitions;


public class AccountLockSettingRecordResponse {
    /**
     *
     */
    public Boolean localRecording;
    /**
     *
     */
    public Boolean cloudRecording;
    /**
     *
     */
    public Boolean autoRecording;
    /**
     *
     */
    public Boolean cloudRecordingDownload;
    /**
     *
     */
    public Boolean hostDeleteCloudRecording;
    /**
     *
     */
    public Boolean accountUserAccessRecording;
    /**
     *
     */
    public Boolean autoDeleteCmr;

    public AccountLockSettingRecordResponse localRecording(Boolean localRecording) {
        this.localRecording = localRecording;
        return this;
    }

    public AccountLockSettingRecordResponse cloudRecording(Boolean cloudRecording) {
        this.cloudRecording = cloudRecording;
        return this;
    }

    public AccountLockSettingRecordResponse autoRecording(Boolean autoRecording) {
        this.autoRecording = autoRecording;
        return this;
    }

    public AccountLockSettingRecordResponse cloudRecordingDownload(Boolean cloudRecordingDownload) {
        this.cloudRecordingDownload = cloudRecordingDownload;
        return this;
    }

    public AccountLockSettingRecordResponse hostDeleteCloudRecording(Boolean hostDeleteCloudRecording) {
        this.hostDeleteCloudRecording = hostDeleteCloudRecording;
        return this;
    }

    public AccountLockSettingRecordResponse accountUserAccessRecording(Boolean accountUserAccessRecording) {
        this.accountUserAccessRecording = accountUserAccessRecording;
        return this;
    }

    public AccountLockSettingRecordResponse autoDeleteCmr(Boolean autoDeleteCmr) {
        this.autoDeleteCmr = autoDeleteCmr;
        return this;
    }
}
