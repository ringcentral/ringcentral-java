package com.ringcentral.definitions;

public class CommStateRefConditionResource {
    /** State condition type Required Enum: Schedule, State */
    public String type;

    public CommStateRefConditionResource type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommStateReferenceResource state;

    public CommStateRefConditionResource state(CommStateReferenceResource state) {
        this.state = state;
        return this;
    }
}
