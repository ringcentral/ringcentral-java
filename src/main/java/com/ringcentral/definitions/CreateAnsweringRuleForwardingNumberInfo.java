package com.ringcentral.definitions;


public class CreateAnsweringRuleForwardingNumberInfo {
    /**
     * Internal identifier of a forwarding number
     */
    public String id;
    /**
     * Canonical URI of a forwarding/call flip phone number
     * Format: uri
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
     * Type of a forwarding number
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other, BusinessMobilePhone, ExternalCarrier
     */
    public String type;

    public CreateAnsweringRuleForwardingNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public CreateAnsweringRuleForwardingNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CreateAnsweringRuleForwardingNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CreateAnsweringRuleForwardingNumberInfo label(String label) {
        this.label = label;
        return this;
    }

    public CreateAnsweringRuleForwardingNumberInfo type(String type) {
        this.type = type;
        return this;
    }
}
