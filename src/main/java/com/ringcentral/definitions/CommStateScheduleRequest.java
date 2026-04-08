package com.ringcentral.definitions;


public class CommStateScheduleRequest
{
    /**
     * Required
     */
    public CommStateScheduleRequestTriggers[] triggers;
    public CommStateScheduleRequest triggers(CommStateScheduleRequestTriggers[] triggers)
    {
        this.triggers = triggers;
        return this;
    }
}