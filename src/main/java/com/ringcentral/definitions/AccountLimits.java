package com.ringcentral.definitions;


public class AccountLimits {
    /**
     * Max number of free softphone phone lines per user extension
     */
    public Long freeSoftPhoneLinesPerExtension;
    /**
     * Max number of participants in RingCentral meeting hosted by this account's user
     */
    public Long meetingSize;
    /**
     * Meetings recording cloud storage limitaion in Gb
     */
    public Long cloudRecordingStorage;
    /**
     * Max number of extensions which can be included in the list of users monitored for Presence
     */
    public Long maxMonitoredExtensionsPerUser;
    /**
     * Max length of extension numbers of an account; the supported value is up to 8 symbols, depends on account type
     * Default: 5
     */
    public Long maxExtensionNumberLength;
    /**
     * Length of a site code
     */
    public Long siteCodeLength;
    /**
     * Length of a short extension number
     */
    public Long shortExtensionNumberLength;

    public AccountLimits freeSoftPhoneLinesPerExtension(Long freeSoftPhoneLinesPerExtension) {
        this.freeSoftPhoneLinesPerExtension = freeSoftPhoneLinesPerExtension;
        return this;
    }

    public AccountLimits meetingSize(Long meetingSize) {
        this.meetingSize = meetingSize;
        return this;
    }

    public AccountLimits cloudRecordingStorage(Long cloudRecordingStorage) {
        this.cloudRecordingStorage = cloudRecordingStorage;
        return this;
    }

    public AccountLimits maxMonitoredExtensionsPerUser(Long maxMonitoredExtensionsPerUser) {
        this.maxMonitoredExtensionsPerUser = maxMonitoredExtensionsPerUser;
        return this;
    }

    public AccountLimits maxExtensionNumberLength(Long maxExtensionNumberLength) {
        this.maxExtensionNumberLength = maxExtensionNumberLength;
        return this;
    }

    public AccountLimits siteCodeLength(Long siteCodeLength) {
        this.siteCodeLength = siteCodeLength;
        return this;
    }

    public AccountLimits shortExtensionNumberLength(Long shortExtensionNumberLength) {
        this.shortExtensionNumberLength = shortExtensionNumberLength;
        return this;
    }

}
