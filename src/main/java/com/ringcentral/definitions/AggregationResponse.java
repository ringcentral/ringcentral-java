package com.ringcentral.definitions;


public class AggregationResponse {
    /**
     * Required
     */
    public ResponsePaging paging;
    /**
     * Required
     */
    public AggregationResponseData data;

    public AggregationResponse paging(ResponsePaging paging) {
        this.paging = paging;
        return this;
    }

    public AggregationResponse data(AggregationResponseData data) {
        this.data = data;
        return this;
    }
}
