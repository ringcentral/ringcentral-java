package com.ringcentral.definitions;


public class ScimPhoneNumber {
    /**
     * Required
     * Enum: work, mobile, other
     */
    public String type;
    /**
     * Required
     */
    public String value;

    public ScimPhoneNumber type(String type) {
        this.type = type;
        return this;
    }

    public ScimPhoneNumber value(String value) {
        this.value = value;
        return this;
    }
}
