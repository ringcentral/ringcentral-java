package com.ringcentral.definitions;


public class RegistrantListResource {
    /**
     * Required
     */
    public RegistrantModel[] records;
    /**
     * Required
     */
    public RcwPagingForwardModel paging;

    public RegistrantListResource records(RegistrantModel[] records) {
        this.records = records;
        return this;
    }

    public RegistrantListResource paging(RcwPagingForwardModel paging) {
        this.paging = paging;
        return this;
    }
}
