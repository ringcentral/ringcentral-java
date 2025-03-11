package com.ringcentral.definitions;


public class CreateForwardingNumberRequest {
    /**
     * Internal identifier of a forwarding/call flip phone number
     */
    public String id;
    /**
     * Number assigned to the call flip phone number, corresponds to the shortcut dial number
     * Format: int32
     */
    public Long flipNumber;
    /**
     * Forwarding/call flip phone number
     */
    public String phoneNumber;
    /**
     * Forwarding/call flip number title
     */
    public String label;
    /**
     * Forwarding/call flip phone type. If specified, &#039;label&#039; attribute value is ignored
     * Default: Other
     * Enum: PhoneLine, Home, Mobile, Work, Other
     */
    public String type;
    /**
     *
     */
    public CreateForwardingNumberDeviceInfo device;

    public CreateForwardingNumberRequest id(String id) {
        this.id = id;
        return this;
    }

    public CreateForwardingNumberRequest flipNumber(Long flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }

    public CreateForwardingNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CreateForwardingNumberRequest label(String label) {
        this.label = label;
        return this;
    }

    public CreateForwardingNumberRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateForwardingNumberRequest device(CreateForwardingNumberDeviceInfo device) {
        this.device = device;
        return this;
    }
}
