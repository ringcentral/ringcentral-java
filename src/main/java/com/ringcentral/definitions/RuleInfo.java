package com.ringcentral.definitions;

public class RuleInfo {
    // Forwarding number (or group) ordinal
    public Long index;
    // Number of rings for a forwarding number (or group)
    public Long ringCount;
    // Forwarding number (or group) data
    public RuleInfo_ForwardingNumberInfo[] forwardingNumbers;
}
