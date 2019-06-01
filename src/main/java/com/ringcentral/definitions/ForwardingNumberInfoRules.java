package com.ringcentral.definitions;


public class ForwardingNumberInfoRules {
    /**
     * Link to a forwarding number resource
     */
    public String uri;
    /**
     * Internal identifier of a forwarding number
     */
    public String id;
    /**
     * Phone number to which the call is forwarded
     */
    public String phoneNumber;
    /**
     * Title of a forwarding number
     */
    public String label;
    /**
     * Type of a forwarding number
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;

    public ForwardingNumberInfoRules uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ForwardingNumberInfoRules id(String id) {
        this.id = id;
        return this;
    }

    public ForwardingNumberInfoRules phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ForwardingNumberInfoRules label(String label) {
        this.label = label;
        return this;
    }

    public ForwardingNumberInfoRules type(String type) {
        this.type = type;
        return this;
    }

}
