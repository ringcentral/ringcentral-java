package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SipFlags
{
    //
    public Boolean voipFeatureEnabled;
    public SipFlags voipFeatureEnabled(Boolean voipFeatureEnabled) {
        this.voipFeatureEnabled = voipFeatureEnabled;
        return this;
    }
    //
    public Boolean voipCountryBlocked;
    public SipFlags voipCountryBlocked(Boolean voipCountryBlocked) {
        this.voipCountryBlocked = voipCountryBlocked;
        return this;
    }
    //
    public Boolean outboundCallsEnabled;
    public SipFlags outboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
        return this;
    }
}
