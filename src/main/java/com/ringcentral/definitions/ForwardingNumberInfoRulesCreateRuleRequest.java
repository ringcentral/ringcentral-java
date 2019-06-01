package com.ringcentral.definitions;


public class ForwardingNumberInfoRulesCreateRuleRequest {
    /**
     * Internal identifier of a forwarding number
     */
    public String id;
    /**
     * Forwarding phone number type
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;

    public ForwardingNumberInfoRulesCreateRuleRequest id(String id) {
        this.id = id;
        return this;
    }

    public ForwardingNumberInfoRulesCreateRuleRequest type(String type) {
        this.type = type;
        return this;
    }

}
