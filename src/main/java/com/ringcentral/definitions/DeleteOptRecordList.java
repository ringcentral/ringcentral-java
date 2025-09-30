package com.ringcentral.definitions;


/**
 * A list of records for deleting SMS consents
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
