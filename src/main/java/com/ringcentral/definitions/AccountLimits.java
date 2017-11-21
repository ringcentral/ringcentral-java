package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountLimits
{
    // The maximum number of free softphone phone lines per user extension
    public Long freeSoftPhoneLinesPerExtension;
    public AccountLimits freeSoftPhoneLinesPerExtension(Long freeSoftPhoneLinesPerExtension) {
        this.freeSoftPhoneLinesPerExtension = freeSoftPhoneLinesPerExtension;
        return this;
    }
    // The maximum number of participants in RingCentral Meeting hosted by this account's user
    public Long meetingSize;
    public AccountLimits meetingSize(Long meetingSize) {
        this.meetingSize = meetingSize;
        return this;
    }
    // The maximum number of extensions which can be included in the list of users monitored for Presence
    public Long maxMonitoredExtensionsPerUser;
    public AccountLimits maxMonitoredExtensionsPerUser(Long maxMonitoredExtensionsPerUser) {
        this.maxMonitoredExtensionsPerUser = maxMonitoredExtensionsPerUser;
        return this;
    }
    // Maximum length for extension numbers of an account; depends on account type. The default value is 5
    public Long maxExtensionNumberLength;
    public AccountLimits maxExtensionNumberLength(Long maxExtensionNumberLength) {
        this.maxExtensionNumberLength = maxExtensionNumberLength;
        return this;
    }
}
