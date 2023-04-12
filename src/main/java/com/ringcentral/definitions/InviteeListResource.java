package com.ringcentral.definitions;


public class InviteeListResource {
    /**
     * Required
     */
    public InviteeModel[] records;
    /**
     * Required
     */
    public RcwPagingModel paging;

    public InviteeListResource records(InviteeModel[] records) {
        this.records = records;
        return this;
    }

    public InviteeListResource paging(RcwPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
