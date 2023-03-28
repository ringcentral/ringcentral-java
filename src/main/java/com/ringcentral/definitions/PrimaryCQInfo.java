package com.ringcentral.definitions;


/**
 * Primary call session information. Supported for Call Queues only
 */
public class PrimaryCQInfo {
    /**
     * Call information to be displayed as &#039;Line 1&#039; for a call queue call session
     * Enum: PhoneNumberLabel, PhoneNumber, QueueExtension, QueueName, CallerIdName, CallerIdNumber, None
     */
    public String type;
    /**
     * Call information value
     */
    public String value;

    public PrimaryCQInfo type(String type) {
        this.type = type;
        return this;
    }

    public PrimaryCQInfo value(String value) {
        this.value = value;
        return this;
    }
}
