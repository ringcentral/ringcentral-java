package com.ringcentral.definitions;

public class CommInteractionRuleScheduleResource {
    /** Start date-time */
    public String startDateTime;

    public CommInteractionRuleScheduleResource startDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /** End date-time */
    public String endDateTime;

    public CommInteractionRuleScheduleResource endDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /** Trigger information */
    public CommInteractionRuleScheduleResourceTriggers[] triggers;

    public CommInteractionRuleScheduleResource triggers(
            CommInteractionRuleScheduleResourceTriggers[] triggers) {
        this.triggers = triggers;
        return this;
    }
}
