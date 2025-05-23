package com.ringcentral.definitions;


public class CommInteractionRuleScheduleConditionRequest {
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

    public CommInteractionRuleScheduleConditionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommInteractionRuleScheduleConditionRequest schedule(CommInteractionRuleScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
}
