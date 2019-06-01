package com.ringcentral.definitions;


public class ForwardingNumberInfo {
    /**
     * Internal identifier of a forwarding/call flip phone number
     */
    public String id;
    /**
     * Canonical URI of a forwarding/call flip phone number
     */
    public String uri;
    /**
     * Forwarding/Call flip phone number
     */
    public String phoneNumber;
    /**
     * Forwarding/Call flip number title
     */
    public String label;
    /**
     * Type of option this phone number is used for. Multiple values are accepted
     */
    public String[] features;
    /**
     * Number assigned to the call flip phone number, corresponds to the shortcut dial number
     */
    public Long flipNumber;
    /**
     * Forwarding phone number type
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;

    public ForwardingNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public ForwardingNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ForwardingNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ForwardingNumberInfo label(String label) {
        this.label = label;
        return this;
    }

    public ForwardingNumberInfo features(String[] features) {
        this.features = features;
        return this;
    }

    public ForwardingNumberInfo flipNumber(Long flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }

    public ForwardingNumberInfo type(String type) {
        this.type = type;
        return this;
    }

}
