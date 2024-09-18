package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Device Authorization" flow
 * with the `urn:ietf:params:oauth:grant-type:device_code` grant type
 */
public class DeviceCodeTokenRequest {
    /**
     * Grant type
     * Required
     * Enum: urn:ietf:params:oauth:grant-type:device_code
     */
    public String grant_type;
    /**
     * For `urn:ietf:params:oauth:grant-type:device_code` grant type only.
     * The device verification code as defined by [RFC-8628](https://datatracker.ietf.org/doc/html/rfc8628#section-3.4)
     * Required
     */
    public String device_code;

    public DeviceCodeTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public DeviceCodeTokenRequest device_code(String device_code) {
        this.device_code = device_code;
        return this;
    }
}
