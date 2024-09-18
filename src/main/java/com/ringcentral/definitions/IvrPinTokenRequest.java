package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "IVR Pin" authorization flow with the `ivr_pin` grant type
 */
public class IvrPinTokenRequest {
    /**
     * Grant type
     * Required
     * Enum: ivr_pin
     */
    public String grant_type;
    /**
     * For `ivr_pin` grant type only. User&#039;s IVR pin.
     * Required
     */
    public String ivr_pin;

    public IvrPinTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public IvrPinTokenRequest ivr_pin(String ivr_pin) {
        this.ivr_pin = ivr_pin;
        return this;
    }
}
