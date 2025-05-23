package com.ringcentral.definitions;


public class CommStateScheduleConditionResource {
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

    public CommStateScheduleConditionResource type(String type) {
        this.type = type;
        return this;
    }

    public CommStateScheduleConditionResource schedule(CommStateScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
}
