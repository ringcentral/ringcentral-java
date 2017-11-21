package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreateSipRegistrationResponse
{
    // SIP settings for device
    public SIPInfoResponse[] sipInfo;
    public CreateSipRegistrationResponse sipInfo(SIPInfoResponse[] sipInfo) {
        this.sipInfo = sipInfo;
        return this;
    }
    // SIP flags data
    public SIPFlagsRespones[] sipFlags;
    public CreateSipRegistrationResponse sipFlags(SIPFlagsRespones[] sipFlags) {
        this.sipFlags = sipFlags;
        return this;
    }
}
