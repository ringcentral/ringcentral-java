package com.ringcentral.definitions;


/**
 * Information on a task for multiple switches creation
 */
public class CreateMultipleSwitchesResponse {
    /**
     *
     */
    public BulkTaskInfo[] task;

    public CreateMultipleSwitchesResponse task(BulkTaskInfo[] task) {
        this.task = task;
        return this;
    }
}
