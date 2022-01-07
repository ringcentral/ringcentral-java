package com.ringcentral.definitions;


public class PerformanceCallsTimelineResponse {
    /**
     * A list of time-value points of call aggregations as per the grouping and filtering options specified in the request
     */
    public TimelineData[] data;

    public PerformanceCallsTimelineResponse data(TimelineData[] data) {
        this.data = data;
        return this;
    }
}
