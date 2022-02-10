package com.ringcentral.definitions;


public class PerformanceCallsTimelineRequest {
    /**
     *
     */
    public PerformanceCallsGrouping grouping;
    /**
     * Required
     */
    public PerformanceCallsTimeRange timeRange;
    /**
     *
     */
    public PerformanceCallsAdditionalFilters additionalFilters;
    /**
     * Required
     */
    public PerformanceCallsResponseDataOptions responseOptions;

    public PerformanceCallsTimelineRequest grouping(PerformanceCallsGrouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public PerformanceCallsTimelineRequest timeRange(PerformanceCallsTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public PerformanceCallsTimelineRequest additionalFilters(PerformanceCallsAdditionalFilters additionalFilters) {
        this.additionalFilters = additionalFilters;
        return this;
    }

    public PerformanceCallsTimelineRequest responseOptions(PerformanceCallsResponseDataOptions responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }
}
