package com.ringcentral.definitions;


public class WebinarListResource
{
    /**
     * Required
     */
    public WcsWebinarResource[] records;
    public WebinarListResource records(WcsWebinarResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public RcwPagingModel paging;
    public WebinarListResource paging(RcwPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}