package com.ringcentral.definitions;


public class PerformanceCallsAggregatesResponse
{
    /**
     * Required
     */
    public ResponsePaging paging;
    public PerformanceCallsAggregatesResponse paging(ResponsePaging paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     * A list of call aggregations as per the grouping and filtering options specified in the request
     */
    public PerformanceCallsData[] data;
    public PerformanceCallsAggregatesResponse data(PerformanceCallsData[] data)
    {
        this.data = data;
        return this;
    }
}