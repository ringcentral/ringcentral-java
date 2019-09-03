package com.ringcentral.definitions;


public class UpdateMultipleSwitchesResponse {
    /**
     * Information on the task for multiple switches update
     */
    public BulkTaskInfo task;

    public UpdateMultipleSwitchesResponse task(BulkTaskInfo task) {
        this.task = task;
        return this;
    }

}
