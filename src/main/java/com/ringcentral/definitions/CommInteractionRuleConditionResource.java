package com.ringcentral.definitions;

public class CommInteractionRuleConditionResource {
    /** Interaction condition type resource Required Enum: Interaction, Schedule, State */
    public String type;

    public CommInteractionRuleConditionResource type(String type) {
        this.type = type;
        return this;
    }
}
