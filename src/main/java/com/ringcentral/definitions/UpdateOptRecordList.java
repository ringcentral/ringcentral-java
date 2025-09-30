package com.ringcentral.definitions;


/**
 * A list of records for updating SMS consents
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
