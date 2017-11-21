package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SIPFlagsRespones
{
    // If 'True' VoIP calling feature is enabled
    public String voipFeatureEnabled;
    public SIPFlagsRespones voipFeatureEnabled(String voipFeatureEnabled) {
        this.voipFeatureEnabled = voipFeatureEnabled;
        return this;
    }
    // If 'True' the request is sent from IP address of a country blocked for VoIP calling
    public String voipCountryBlocked;
    public SIPFlagsRespones voipCountryBlocked(String voipCountryBlocked) {
        this.voipCountryBlocked = voipCountryBlocked;
        return this;
    }
    // If 'True' outbound calls are enabled
    public String outboundCallsEnabled;
    public SIPFlagsRespones outboundCallsEnabled(String outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
        return this;
    }
}
