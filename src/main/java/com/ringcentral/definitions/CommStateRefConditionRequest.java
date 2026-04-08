package com.ringcentral.definitions;

public class CommStateRefConditionRequest {
    /** State condition type Required Enum: Schedule, State */
    public String type;

    public CommStateRefConditionRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommReferenceStateResource state;

    public CommStateRefConditionRequest state(CommReferenceStateResource state) {
        this.state = state;
        return this;
    }
}
