package com.ringcentral.definitions;


public class CallRecordingIds {
    /**
     * Call recordings ID(s) to delete
     * Required
     */
    public String[] records;

    public CallRecordingIds records(String[] records) {
        this.records = records;
        return this;
    }
}
