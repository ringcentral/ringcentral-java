package com.ringcentral.definitions;

public class CommStatesResource {
    /** Required */
    public CommStateResource[] records;

    public CommStatesResource records(CommStateResource[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public CommStatesResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
