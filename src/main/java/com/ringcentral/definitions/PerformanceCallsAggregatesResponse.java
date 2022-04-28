package com.ringcentral.definitions;


public class PerformanceCallsAggregatesResponse {
    /**
     * Required
     */
    public ResponsePaging paging;
    /**
     * A list of call aggregations as per the grouping and filtering options specified in the request
     */
    public PerformanceCallsData[] data;

    public PerformanceCallsAggregatesResponse paging(ResponsePaging paging) {
        this.paging = paging;
        return this;
    }

    public PerformanceCallsAggregatesResponse data(PerformanceCallsData[] data) {
        this.data = data;
        return this;
    }
}
