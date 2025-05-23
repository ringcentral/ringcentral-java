package com.ringcentral.definitions;


public class OptRecordsModificationSummary {
    /**
     *
     */
    public SmsOptFailureRecord[] failedRecords;

    public OptRecordsModificationSummary failedRecords(SmsOptFailureRecord[] failedRecords) {
        this.failedRecords = failedRecords;
        return this;
    }
}
