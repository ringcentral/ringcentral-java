package com.ringcentral.definitions;


public class WcsInviteeListResource
{
    /**
     * Required
     */
    public InviteeResource[] records;
    public WcsInviteeListResource records(InviteeResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public RcwPagingModel paging;
    public WcsInviteeListResource paging(RcwPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}