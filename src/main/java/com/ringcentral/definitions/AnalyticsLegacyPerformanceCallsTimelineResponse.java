package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimelineResponse {
    /**
     * A list of time-value points of call aggregations as per the grouping and filtering options specified in the request
     */
    public AnalyticsLegacyTimelineData[] data;

    public AnalyticsLegacyPerformanceCallsTimelineResponse data(AnalyticsLegacyTimelineData[] data) {
        this.data = data;
        return this;
    }
}
