package com.ringcentral.definitions;


public class IdentitiesList {
    /**
     * Required
     */
    public IdentityModel[] records;
    /**
     * Required
     */
    public NonEnumeratedPagingModel paging;

    public IdentitiesList records(IdentityModel[] records) {
        this.records = records;
        return this;
    }

    public IdentitiesList paging(NonEnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
