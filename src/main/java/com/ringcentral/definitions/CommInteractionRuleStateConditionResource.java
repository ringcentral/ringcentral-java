package com.ringcentral.definitions;


public class CommInteractionRuleStateConditionResource {
    /**
     * Ring target type
     * Required
     * Example: State
     * Enum: Interaction, Schedule, State
     */
    public String type;
    /**
     *
     */
    public CommStateResource state;

    public CommInteractionRuleStateConditionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommInteractionRuleStateConditionResource state(CommStateResource state) {
        this.state = state;
        return this;
    }
}
