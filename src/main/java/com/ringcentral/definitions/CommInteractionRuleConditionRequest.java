package com.ringcentral.definitions;


public class CommInteractionRuleConditionRequest {
    /**
     * Ring target type
     * Required
     * Enum: Interaction, Schedule, State
     */
    public String type;

    public CommInteractionRuleConditionRequest type(String type) {
        this.type = type;
        return this;
    }
}
