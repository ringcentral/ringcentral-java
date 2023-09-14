package com.ringcentral.definitions;


public class ForwardingNumberInfoRulesCreateRuleRequest {
    /**
     * Internal identifier of a forwarding number
     */
    public String id;
    /**
     * Forwarding phone number type
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other, BusinessMobilePhone, ExternalCarrier, ExtensionApps
     */
    public String type;
    /**
     * Forwarding/Call flip phone number
     */
    public String phoneNumber;
    /**
     * Forwarding/Call flip number title
     */
    public String label;

    public ForwardingNumberInfoRulesCreateRuleRequest id(String id) {
        this.id = id;
        return this;
    }

    public ForwardingNumberInfoRulesCreateRuleRequest type(String type) {
        this.type = type;
        return this;
    }

    public ForwardingNumberInfoRulesCreateRuleRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ForwardingNumberInfoRulesCreateRuleRequest label(String label) {
        this.label = label;
        return this;
    }
}
