package com.ringcentral.definitions;


public class CommInteractionRuleStateConditionResource
{
    /**
     * Interaction condition type resource
     * Required
     * Example: State
     * Enum: Interaction, Schedule, State
     */
    public String type;
    public CommInteractionRuleStateConditionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommStateResource state;
    public CommInteractionRuleStateConditionResource state(CommStateResource state)
    {
        this.state = state;
        return this;
    }
}