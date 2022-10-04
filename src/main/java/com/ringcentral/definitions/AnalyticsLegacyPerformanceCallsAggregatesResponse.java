package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsAggregatesResponse {
    /**
     * Required
     */
    public AnalyticsLegacyResponsePaging paging;
    /**
     * A list of call aggregations as per the grouping and filtering options specified in the request
     */
    public AnalyticsLegacyPerformanceCallsData[] data;

    public AnalyticsLegacyPerformanceCallsAggregatesResponse paging(AnalyticsLegacyResponsePaging paging) {
        this.paging = paging;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsAggregatesResponse data(AnalyticsLegacyPerformanceCallsData[] data) {
        this.data = data;
        return this;
    }
}
