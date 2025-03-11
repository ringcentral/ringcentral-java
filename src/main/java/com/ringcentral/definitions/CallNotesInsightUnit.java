package com.ringcentral.definitions;


public class CallNotesInsightUnit {
    /**
     * Value of the call notes
     * Required
     * Example: call notes text
     */
    public String value;

    public CallNotesInsightUnit value(String value) {
        this.value = value;
        return this;
    }
}
