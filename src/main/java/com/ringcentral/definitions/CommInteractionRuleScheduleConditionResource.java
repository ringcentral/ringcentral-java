package com.ringcentral.definitions;


public class CommInteractionRuleScheduleConditionResource
{
    /**
     * Interaction condition type resource
     * Required
     * Example: Schedule
     * Enum: Interaction, Schedule, State
     */
    public String type;
    public CommInteractionRuleScheduleConditionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommInteractionRuleScheduleResource schedule;
    public CommInteractionRuleScheduleConditionResource schedule(CommInteractionRuleScheduleResource schedule)
    {
        this.schedule = schedule;
        return this;
    }
}