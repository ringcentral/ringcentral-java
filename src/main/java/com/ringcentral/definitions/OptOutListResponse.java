package com.ringcentral.definitions;


/**
 * Opt-out phone numbers information
 */
public class OptOutListResponse {
    /**
     * List of individual opt-out number records
     */
    public OptOutResponse[] records;
    /**
     *
     */
    public PagingResource paging;

    public OptOutListResponse records(OptOutResponse[] records) {
        this.records = records;
        return this;
    }

    public OptOutListResponse paging(PagingResource paging) {
        this.paging = paging;
        return this;
    }
}
