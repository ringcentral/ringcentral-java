package com.ringcentral.definitions;

public class CommInteractionRuleScheduleConditionRequest {
    /**
     * Interaction condition type resource Required Example: Schedule Enum: Interaction, Schedule,
     * State
     */
    public String type;

    public CommInteractionRuleScheduleConditionRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommInteractionRuleScheduleResource schedule;

    public CommInteractionRuleScheduleConditionRequest schedule(
            CommInteractionRuleScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
}
