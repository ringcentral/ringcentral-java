package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingNumberInfoRules
{
    // Link to a forwarding number resource
    public String uri;
    public ForwardingNumberInfoRules uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of a forwarding number
    public String id;
    public ForwardingNumberInfoRules id(String id) {
        this.id = id;
        return this;
    }
    // Phone number to which the call is forwarded
    public String phoneNumber;
    public ForwardingNumberInfoRules phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Title of a forwarding number
    public String label;
    public ForwardingNumberInfoRules label(String label) {
        this.label = label;
        return this;
    }
}
