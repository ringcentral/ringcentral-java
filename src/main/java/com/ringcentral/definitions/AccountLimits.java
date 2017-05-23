package com.ringcentral.definitions;

public class AccountLimits {
    // The maximum number of free softphone digital lines per user extension
    public Long freeSoftPhoneLinesPerExtension;
    // The maximum number of participants in RingCentral Meeting hosted by this account's user
    public Long meetingSize;
    // The maximum number of extensions which can be included in the list of users monitored for Presence
    public Long maxMonitoredExtensionsPerUser;

    public AccountLimits freeSoftPhoneLinesPerExtension(Long freeSoftPhoneLinesPerExtension) {
        this.freeSoftPhoneLinesPerExtension = freeSoftPhoneLinesPerExtension;
        return this;
    }

    public AccountLimits meetingSize(Long meetingSize) {
        this.meetingSize = meetingSize;
        return this;
    }

    public AccountLimits maxMonitoredExtensionsPerUser(Long maxMonitoredExtensionsPerUser) {
        this.maxMonitoredExtensionsPerUser = maxMonitoredExtensionsPerUser;
        return this;
    }
}
