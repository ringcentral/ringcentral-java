package com.ringcentral.definitions;


public class ScimEmail {
    /**
     * Required
     * Enum: work
     */
    public String type;
    /**
     * Required
     */
    public String value;

    public ScimEmail type(String type) {
        this.type = type;
        return this;
    }

    public ScimEmail value(String value) {
        this.value = value;
        return this;
    }
}
