package com.ringcentral.definitions;


public class CommStateScheduleConditionResource
{
    /**
     * State condition type
     * Required
     * Enum: Schedule, State
     */
    public String type;
    public CommStateScheduleConditionResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommStateScheduleResource schedule;
    public CommStateScheduleConditionResource schedule(CommStateScheduleResource schedule)
    {
        this.schedule = schedule;
        return this;
    }
}