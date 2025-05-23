package com.ringcentral.definitions;


public class CommInteractionRuleScheduleResource {
    /**
     * Start date-time
     * Format: date-time
     */
    public String startDateTime;
    /**
     * End date-time
     * Format: date-time
     */
    public String endDateTime;
    /**
     * Trigger information
     */
    public CommInteractionRuleScheduleResourceTriggers[] triggers;

    public CommInteractionRuleScheduleResource startDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public CommInteractionRuleScheduleResource endDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    public CommInteractionRuleScheduleResource triggers(CommInteractionRuleScheduleResourceTriggers[] triggers) {
        this.triggers = triggers;
        return this;
    }
}
