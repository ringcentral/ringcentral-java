package com.ringcentral.definitions;


public class CommInteractionRuleInteractionConditionResource
{
    /**
     * Interaction condition type resource
     * Required
     * Example: Interaction
     * Enum: Interaction, Schedule, State
     */
    public String type;
    public CommInteractionRuleInteractionConditionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommFromResource[] from;
    public CommInteractionRuleInteractionConditionResource from(CommFromResource[] from)
    {
        this.from = from;
        return this;
    }

    /**
     * Required
     */
    public String[] to;
    public CommInteractionRuleInteractionConditionResource to(String[] to)
    {
        this.to = to;
        return this;
    }
}