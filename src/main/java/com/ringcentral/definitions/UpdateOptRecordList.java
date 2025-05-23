package com.ringcentral.definitions;


/**
 * The list of records to update opt statuses of phone numbers
 */
public class UpdateOptRecordList {
    /**
     * Required
     */
    public UpdateSmsOptRecord[] records;

    public UpdateOptRecordList records(UpdateSmsOptRecord[] records) {
        this.records = records;
        return this;
    }
}
