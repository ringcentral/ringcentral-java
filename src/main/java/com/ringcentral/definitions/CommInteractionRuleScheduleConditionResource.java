package com.ringcentral.definitions;


public class CommInteractionRuleScheduleConditionResource {
    /**
     * Ring target type
     * Required
     * Example: Schedule
     * Enum: Interaction, Schedule, State
     */
    public String type;
    /**
     * Required
     */
    public CommInteractionRuleScheduleResource schedule;

    public CommInteractionRuleScheduleConditionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommInteractionRuleScheduleConditionResource schedule(CommInteractionRuleScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
}
