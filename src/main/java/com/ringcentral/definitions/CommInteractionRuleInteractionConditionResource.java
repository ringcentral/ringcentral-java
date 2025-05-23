package com.ringcentral.definitions;


public class CommInteractionRuleInteractionConditionResource {
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

    public CommInteractionRuleInteractionConditionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommInteractionRuleInteractionConditionResource from(CommFromResource[] from) {
        this.from = from;
        return this;
    }

    public CommInteractionRuleInteractionConditionResource to(String[] to) {
        this.to = to;
        return this;
    }
}
