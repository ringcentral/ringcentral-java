package com.ringcentral.definitions;


public class CommStateConditionResource {
    /**
     * Ring target type
     * Required
     * Enum: Schedule, State
     */
    public String type;

    public CommStateConditionResource type(String type) {
        this.type = type;
        return this;
    }
}
