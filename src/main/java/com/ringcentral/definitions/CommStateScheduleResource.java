package com.ringcentral.definitions;


public class CommStateScheduleResource {
    /**
     * Required
     */
    public CommStateScheduleResourceTriggers[] triggers;

    public CommStateScheduleResource triggers(CommStateScheduleResourceTriggers[] triggers) {
        this.triggers = triggers;
        return this;
    }
}
