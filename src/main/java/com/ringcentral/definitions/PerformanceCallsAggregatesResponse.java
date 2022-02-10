package com.ringcentral.definitions;


public class PerformanceCallsAggregatesResponse {
    /**
     * Required
     */
    public PerformanceCallsData[] data;
    /**
     *
     */
    public PerformanceCallsPaging paging;

    public PerformanceCallsAggregatesResponse data(PerformanceCallsData[] data) {
        this.data = data;
        return this;
    }

    public PerformanceCallsAggregatesResponse paging(PerformanceCallsPaging paging) {
        this.paging = paging;
        return this;
    }
}
