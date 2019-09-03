package com.ringcentral.definitions;


public class UpdateMultipleWirelessPointsResponse {
    /**
     * Information on the task for multiple wireless points update
     */
    public BulkTaskInfo task;

    public UpdateMultipleWirelessPointsResponse task(BulkTaskInfo task) {
        this.task = task;
        return this;
    }

}
