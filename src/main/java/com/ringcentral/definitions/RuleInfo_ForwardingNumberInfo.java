package com.ringcentral.definitions;

public class RuleInfo_ForwardingNumberInfo {
    // Link to a forwarding number resource
    public String uri;
    // Internal identifier of a forwarding number
    public String id;
    // Phone number to which the call is forwarded
    public String phoneNumber;
    // Title of a forwarding number
    public String label;

    public RuleInfo_ForwardingNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RuleInfo_ForwardingNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public RuleInfo_ForwardingNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public RuleInfo_ForwardingNumberInfo label(String label) {
        this.label = label;
        return this;
    }
}
