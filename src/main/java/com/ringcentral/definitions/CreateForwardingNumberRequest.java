package com.ringcentral.definitions;

public class CreateForwardingNumberRequest {
    /** Internal identifier of a forwarding/call flip phone number */
    public String id;

    public CreateForwardingNumberRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Number assigned to the call flip phone number, corresponds to the shortcut dial number
     * Format: int32
     */
    public Long flipNumber;

    public CreateForwardingNumberRequest flipNumber(Long flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }

    /** Forwarding/call flip phone number */
    public String phoneNumber;

    public CreateForwardingNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /** Forwarding/call flip number title */
    public String label;

    public CreateForwardingNumberRequest label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Forwarding/call flip phone type. If specified, &#039;label&#039; attribute value is ignored
     * Default: Other Enum: PhoneLine, Home, Mobile, Work, Other
     */
    public String type;

    public CreateForwardingNumberRequest type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CreateForwardingNumberDeviceInfo device;

    public CreateForwardingNumberRequest device(CreateForwardingNumberDeviceInfo device) {
        this.device = device;
        return this;
    }
}
