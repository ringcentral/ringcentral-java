package com.ringcentral.definitions;


public class CreateMultipleWirelessPointsResponse {
    /**
     * Information on the task for multiple wireless points creation
     */
    public BulkTaskInfo task;

    public CreateMultipleWirelessPointsResponse task(BulkTaskInfo task) {
        this.task = task;
        return this;
    }

}
