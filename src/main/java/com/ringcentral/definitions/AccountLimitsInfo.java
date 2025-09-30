package com.ringcentral.definitions;


/**
 * Limits which are effective for the account
 */
public class AccountLimitsInfo {
    /**
     * Max number of free softphone phone lines per user extension
     * Format: int32
     */
    public Long freeSoftPhoneLinesPerExtension;
    /**
     * Max number of participants in RingCentral meeting hosted by
     * this account&#039;s user
     * Format: int32
     */
    public Long meetingSize;
    /**
     * Meetings recording cloud storage limitation in Gb
     * Format: int32
     */
    public Long cloudRecordingStorage;
    /**
     * Max number of extensions which can be included in the list
     * of users monitored for Presence
     * Format: int32
     */
    public Long maxMonitoredExtensionsPerUser;
    /**
     * Max length of extension numbers of an account; the supported
     * value is up to 8 symbols, depends on account type
     * Format: int32
     */
    public Long maxExtensionNumberLength;
    /**
     * Length of a site code
     * Format: int32
     */
    public Long siteCodeLength;
    /**
     * Length of a short extension number
     * Format: int32
     */
    public Long shortExtensionNumberLength;

    public AccountLimitsInfo freeSoftPhoneLinesPerExtension(Long freeSoftPhoneLinesPerExtension) {
        this.freeSoftPhoneLinesPerExtension = freeSoftPhoneLinesPerExtension;
        return this;
    }

    public AccountLimitsInfo meetingSize(Long meetingSize) {
        this.meetingSize = meetingSize;
        return this;
    }

    public AccountLimitsInfo cloudRecordingStorage(Long cloudRecordingStorage) {
        this.cloudRecordingStorage = cloudRecordingStorage;
        return this;
    }

    public AccountLimitsInfo maxMonitoredExtensionsPerUser(Long maxMonitoredExtensionsPerUser) {
        this.maxMonitoredExtensionsPerUser = maxMonitoredExtensionsPerUser;
        return this;
    }

    public AccountLimitsInfo maxExtensionNumberLength(Long maxExtensionNumberLength) {
        this.maxExtensionNumberLength = maxExtensionNumberLength;
        return this;
    }

    public AccountLimitsInfo siteCodeLength(Long siteCodeLength) {
        this.siteCodeLength = siteCodeLength;
        return this;
    }

    public AccountLimitsInfo shortExtensionNumberLength(Long shortExtensionNumberLength) {
        this.shortExtensionNumberLength = shortExtensionNumberLength;
        return this;
    }
}
