package com.ringcentral.definitions;


/**
 * Information on the task for multiple switches creation
 */
public class CreateMultipleSwitchesResponse {
    /**
     *
     */
    public BulkTaskInfoSwUpdate task;

    public CreateMultipleSwitchesResponse task(BulkTaskInfoSwUpdate task) {
        this.task = task;
        return this;
    }
}
