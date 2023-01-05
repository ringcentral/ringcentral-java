package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsAggregatesResponse
{
    /**
     * Required
     */
    public AnalyticsLegacyResponsePaging paging;
    public AnalyticsLegacyPerformanceCallsAggregatesResponse paging(AnalyticsLegacyResponsePaging paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     * A list of call aggregations as per the grouping and filtering options specified in the request
     */
    public AnalyticsLegacyPerformanceCallsData[] data;
    public AnalyticsLegacyPerformanceCallsAggregatesResponse data(AnalyticsLegacyPerformanceCallsData[] data)
    {
        this.data = data;
        return this;
    }
}