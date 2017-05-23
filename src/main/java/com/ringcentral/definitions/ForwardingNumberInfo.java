package com.ringcentral.definitions;

public class ForwardingNumberInfo {
    // Internal identifier of a forwarding/call flip phone number
    public String id;
    // Canonical URI of a forwarding/call flip phone number
    public String uri;
    // Forwarding/Call flip phone number
    public String phoneNumber;
    // Forwarding/Call flip number title
    public String label;
    // Type of option this phone number is used for. Multiple values are accepted
    public String features;
    // Number assigned to the call flip phone number, corresponds to the shortcut dial number
    public Long flipNumber;
}
