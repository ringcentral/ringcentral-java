package com.ringcentral.definitions;


public class AggregationResponse
{
    /**
     * Required
     */
    public ResponsePaging paging;
    public AggregationResponse paging(ResponsePaging paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     * Required
     */
    public AggregationResponseData data;
    public AggregationResponse data(AggregationResponseData data)
    {
        this.data = data;
        return this;
    }
}