package com.ringcentral.definitions;


/**
 * The list of opt outs
 */
public class OptOutListResponse {
    /**
     * List of individual opt-out number records
     */
    public OptOutResponse[] records;
    /**
     *
     */
    public NonEnumeratedPagingModel paging;

    public OptOutListResponse records(OptOutResponse[] records) {
        this.records = records;
        return this;
    }

    public OptOutListResponse paging(NonEnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
