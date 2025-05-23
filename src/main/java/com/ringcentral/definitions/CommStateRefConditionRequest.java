package com.ringcentral.definitions;


public class CommStateRefConditionRequest {
    /**
     * Ring target type
     * Required
     * Enum: Schedule, State
     */
    public String type;
    /**
     * Required
     */
    public CommReferenceStateResource state;

    public CommStateRefConditionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommStateRefConditionRequest state(CommReferenceStateResource state) {
        this.state = state;
        return this;
    }
}
