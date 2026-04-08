package com.ringcentral.definitions;


public class SessionGlobalListResource
{
    /**
     * Required
     */
    public SessionGlobalResource[] records;
    public SessionGlobalListResource records(SessionGlobalResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public RcwPagingModel paging;
    public SessionGlobalListResource paging(RcwPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}