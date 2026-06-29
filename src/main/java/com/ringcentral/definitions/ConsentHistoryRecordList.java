package com.ringcentral.definitions;

/** A list of SMS consent records */
public class ConsentHistoryRecordList {
    /** Required */
    public SmsOptHistoryRecord[] records;

    public ConsentHistoryRecordList records(SmsOptHistoryRecord[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public NonEnumeratedPagingModel paging;

    public ConsentHistoryRecordList paging(NonEnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
