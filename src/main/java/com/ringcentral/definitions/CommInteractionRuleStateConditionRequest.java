package com.ringcentral.definitions;


public class CommInteractionRuleStateConditionRequest
{
    /**
     * Interaction condition type resource
     * Required
     * Example: State
     * Enum: Interaction, Schedule, State
     */
    public String type;
    public CommInteractionRuleStateConditionRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommReferenceStateResource state;
    public CommInteractionRuleStateConditionRequest state(CommReferenceStateResource state)
    {
        this.state = state;
        return this;
    }
}