package com.ringcentral.definitions;


public class CommStateScheduleConditionRequest {
    /**
     * Ring target type
     * Required
     * Enum: Schedule, State
     */
    public String type;
    /**
     * Required
     */
    public CommStateScheduleResource schedule;

    public CommStateScheduleConditionRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommStateScheduleConditionRequest schedule(CommStateScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
}
