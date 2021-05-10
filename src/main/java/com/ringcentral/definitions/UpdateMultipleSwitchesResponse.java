package com.ringcentral.definitions;


public class UpdateMultipleSwitchesResponse {
    /**
     *
     */
    public BulkTaskInfoSwUpdate task;

    public UpdateMultipleSwitchesResponse task(BulkTaskInfoSwUpdate task) {
        this.task = task;
        return this;
    }
}
