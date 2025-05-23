package com.ringcentral.definitions;


public class CommInteractionRuleInteractionConditionRequest {
    /**
     * Ring target type
     * Required
     * Example: Interaction
     * Enum: Interaction, Schedule, State
     */
    public String type;
    /**
     * Required
     */
    public CommFromResource[] from;
    /**
     * Required
     */
    public String[] to;

    public CommInteractionRuleInteractionConditionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommInteractionRuleInteractionConditionRequest from(CommFromResource[] from) {
        this.from = from;
        return this;
    }

    public CommInteractionRuleInteractionConditionRequest to(String[] to) {
        this.to = to;
        return this;
    }
}
