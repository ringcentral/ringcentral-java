package com.ringcentral.definitions;


public class TaskResultInfo {
    /**
     * Detailed task results by elements from initial request
     */
    public TaskResultRecord[] records;

    public TaskResultInfo records(TaskResultRecord[] records) {
        this.records = records;
        return this;
    }

}
