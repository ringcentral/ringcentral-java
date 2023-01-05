package com.ringcentral.definitions;


    /**
* Limits which are effective for the account
*/
public class AccountLimits
{
    /**
     * Max number of free softphone phone lines per user extension
     * Format: int32
     */
    public Long freeSoftPhoneLinesPerExtension;
    public AccountLimits freeSoftPhoneLinesPerExtension(Long freeSoftPhoneLinesPerExtension)
    {
        this.freeSoftPhoneLinesPerExtension = freeSoftPhoneLinesPerExtension;
        return this;
    }

    /**
     * Max number of participants in RingCentral meeting hosted by
    * this account&#039;s user
     * Format: int32
     */
    public Long meetingSize;
    public AccountLimits meetingSize(Long meetingSize)
    {
        this.meetingSize = meetingSize;
        return this;
    }

    /**
     * Meetings recording cloud storage limitation in Gb
     * Format: int32
     */
    public Long cloudRecordingStorage;
    public AccountLimits cloudRecordingStorage(Long cloudRecordingStorage)
    {
        this.cloudRecordingStorage = cloudRecordingStorage;
        return this;
    }

    /**
     * Max number of extensions which can be included in the list
    * of users monitored for Presence
     * Format: int32
     */
    public Long maxMonitoredExtensionsPerUser;
    public AccountLimits maxMonitoredExtensionsPerUser(Long maxMonitoredExtensionsPerUser)
    {
        this.maxMonitoredExtensionsPerUser = maxMonitoredExtensionsPerUser;
        return this;
    }

    /**
     * Max length of extension numbers of an account; the supported
    * value is up to 8 symbols, depends on account type
     * Format: int32
     */
    public Long maxExtensionNumberLength;
    public AccountLimits maxExtensionNumberLength(Long maxExtensionNumberLength)
    {
        this.maxExtensionNumberLength = maxExtensionNumberLength;
        return this;
    }

    /**
     * Length of a site code
     * Format: int32
     */
    public Long siteCodeLength;
    public AccountLimits siteCodeLength(Long siteCodeLength)
    {
        this.siteCodeLength = siteCodeLength;
        return this;
    }

    /**
     * Length of a short extension number
     * Format: int32
     */
    public Long shortExtensionNumberLength;
    public AccountLimits shortExtensionNumberLength(Long shortExtensionNumberLength)
    {
        this.shortExtensionNumberLength = shortExtensionNumberLength;
        return this;
    }
}