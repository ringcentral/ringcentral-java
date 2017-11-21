package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountLimitsResource
{
    //
    public Long freeSoftPhoneLinesPerExtension;
    public AccountLimitsResource freeSoftPhoneLinesPerExtension(Long freeSoftPhoneLinesPerExtension) {
        this.freeSoftPhoneLinesPerExtension = freeSoftPhoneLinesPerExtension;
        return this;
    }
    //
    public Long meetingSize;
    public AccountLimitsResource meetingSize(Long meetingSize) {
        this.meetingSize = meetingSize;
        return this;
    }
    //
    public Long maxMonitoredExtensionsPerUser;
    public AccountLimitsResource maxMonitoredExtensionsPerUser(Long maxMonitoredExtensionsPerUser) {
        this.maxMonitoredExtensionsPerUser = maxMonitoredExtensionsPerUser;
        return this;
    }
    //
    public Long maxFreeDigitalLines;
    public AccountLimitsResource maxFreeDigitalLines(Long maxFreeDigitalLines) {
        this.maxFreeDigitalLines = maxFreeDigitalLines;
        return this;
    }
}
