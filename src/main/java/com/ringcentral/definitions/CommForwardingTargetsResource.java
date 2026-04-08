package com.ringcentral.definitions;


public class CommForwardingTargetsResource
{
    /**
     * Required
     */
    public CommForwardingTargetsResourceRecords[] records;
    public CommForwardingTargetsResource records(CommForwardingTargetsResourceRecords[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public CommForwardingTargetsResource paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}