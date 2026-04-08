package com.ringcentral.definitions;


public class CommStateScheduleConditionRequest
{
    /**
     * State condition type
     * Required
     * Enum: Schedule, State
     */
    public String type;
    public CommStateScheduleConditionRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommStateScheduleRequest schedule;
    public CommStateScheduleConditionRequest schedule(CommStateScheduleRequest schedule)
    {
        this.schedule = schedule;
        return this;
    }
}