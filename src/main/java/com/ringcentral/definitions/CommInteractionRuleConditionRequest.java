package com.ringcentral.definitions;


public class CommInteractionRuleConditionRequest
{
    /**
     * Interaction condition type resource
     * Required
     * Enum: Interaction, Schedule, State
     */
    public String type;
    public CommInteractionRuleConditionRequest type(String type)
    {
        this.type = type;
        return this;
    }
}