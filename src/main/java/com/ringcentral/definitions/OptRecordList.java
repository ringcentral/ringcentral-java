package com.ringcentral.definitions;


/**
 * The list of records with opt statuses
 */
public class OptRecordList {
    /**
     * Required
     */
    public SmsOptRecord[] records;
    /**
     * Required
     */
    public NonEnumeratedPagingModel paging;

    public OptRecordList records(SmsOptRecord[] records) {
        this.records = records;
        return this;
    }

    public OptRecordList paging(NonEnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
