package com.ringcentral.definitions;


public class CommInteractionRuleStateConditionRequest {
    /**
     * Ring target type
     * Required
     * Example: State
     * Enum: Interaction, Schedule, State
     */
    public String type;
    /**
     * Required
     */
    public CommReferenceStateResource state;

    public CommInteractionRuleStateConditionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommInteractionRuleStateConditionRequest state(CommReferenceStateResource state) {
        this.state = state;
        return this;
    }
}
