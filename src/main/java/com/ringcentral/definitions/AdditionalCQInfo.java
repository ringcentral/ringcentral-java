package com.ringcentral.definitions;


public class AdditionalCQInfo {
    /**
     * Call information to be displayed as 'Line 2' for a call queue call session
     * Enum: PhoneNumberLabel, PhoneNumber, QueueExtension, QueueName, CallerIdName, CallerIdNumber, None
     */
    public String type;
    /**
     * Call information value
     */
    public String value;

    public AdditionalCQInfo type(String type) {
        this.type = type;
        return this;
    }

    public AdditionalCQInfo value(String value) {
        this.value = value;
        return this;
    }

}
