package com.ringcentral.definitions;


public class TMTaskList {
    /**
     *
     */
    public TMTaskListRecords[] records;

    public TMTaskList records(TMTaskListRecords[] records) {
        this.records = records;
        return this;
    }
}
