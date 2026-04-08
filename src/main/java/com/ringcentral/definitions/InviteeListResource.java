package com.ringcentral.definitions;


public class InviteeListResource
{
    /**
     * Required
     */
    public InviteeModel[] records;
    public InviteeListResource records(InviteeModel[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public RcwPagingModel paging;
    public InviteeListResource paging(RcwPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}