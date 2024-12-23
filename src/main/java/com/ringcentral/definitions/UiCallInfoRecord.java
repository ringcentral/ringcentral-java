package com.ringcentral.definitions;


public class UiCallInfoRecord {
    /**
     * UI call info type
     * Enum: QueueName, CallerIdName
     */
    public String type;
    /**
     * UI call info value
     * Example: John Doe
     */
    public String value;

    public UiCallInfoRecord type(String type) {
        this.type = type;
        return this;
    }

    public UiCallInfoRecord value(String value) {
        this.value = value;
        return this;
    }
}
