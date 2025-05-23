package com.ringcentral.definitions;


public class CommStateRefConditionResource {
    /**
     * Ring target type
     * Required
     * Enum: Schedule, State
     */
    public String type;
    /**
     *
     */
    public CommStateReferenceResource state;

    public CommStateRefConditionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommStateRefConditionResource state(CommStateReferenceResource state) {
        this.state = state;
        return this;
    }
}
