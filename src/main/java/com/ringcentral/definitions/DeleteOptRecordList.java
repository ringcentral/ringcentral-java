package com.ringcentral.definitions;


/**
 * The list of records to delete opt statuses of phone numbers
 */
public class DeleteOptRecordList {
    /**
     * Required
     */
    public MinimalSmsOptRecord[] records;

    public DeleteOptRecordList records(MinimalSmsOptRecord[] records) {
        this.records = records;
        return this;
    }
}
