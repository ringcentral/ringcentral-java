package com.ringcentral.definitions;


public class CommInteractionRuleInteractionConditionRequest
{
    /**
     * Interaction condition type resource
     * Required
     * Example: Interaction
     * Enum: Interaction, Schedule, State
     */
    public String type;
    public CommInteractionRuleInteractionConditionRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommFromResource[] from;
    public CommInteractionRuleInteractionConditionRequest from(CommFromResource[] from)
    {
        this.from = from;
        return this;
    }

    /**
     * Required
     */
    public String[] to;
    public CommInteractionRuleInteractionConditionRequest to(String[] to)
    {
        this.to = to;
        return this;
    }
}