package com.ringcentral.definitions;


public class UpdateForwardingNumberRequest {
    /**
     * Forwarding/Call flip phone number
     */
    public String phoneNumber;
    /**
     * Forwarding/Call flip number title
     */
    public String label;
    /**
     * Number assigned to the call flip phone number, corresponds to the shortcut dial number
     */
    public String flipNumber;
    /**
     * Forwarding phone number type
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;

    public UpdateForwardingNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UpdateForwardingNumberRequest label(String label) {
        this.label = label;
        return this;
    }

    public UpdateForwardingNumberRequest flipNumber(String flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }

    public UpdateForwardingNumberRequest type(String type) {
        this.type = type;
        return this;
    }

}
