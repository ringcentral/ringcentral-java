package com.ringcentral.definitions;


public class CommInteractionRuleConditionResource {
    /**
     * Ring target type
     * Required
     * Enum: Interaction, Schedule, State
     */
    public String type;

    public CommInteractionRuleConditionResource type(String type) {
        this.type = type;
        return this;
    }
}
