package com.ringcentral.definitions;


public class CommStateConditionRequest {
    /**
     * Ring target type
     * Required
     * Enum: Schedule, State
     */
    public String type;

    public CommStateConditionRequest type(String type) {
        this.type = type;
        return this;
    }
}
