package com.ringcentral.definitions;


public class PerformanceCallsAggregatesRequest {
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
    public PerformanceCallsFilters additionalFilters;
    /**
     * Required
     */
    public PerformanceCallsResponseDataOptions responseOptions;

    public PerformanceCallsAggregatesRequest grouping(PerformanceCallsGrouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public PerformanceCallsAggregatesRequest timeRange(PerformanceCallsTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public PerformanceCallsAggregatesRequest additionalFilters(PerformanceCallsFilters additionalFilters) {
        this.additionalFilters = additionalFilters;
        return this;
    }

    public PerformanceCallsAggregatesRequest responseOptions(PerformanceCallsResponseDataOptions responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }
}
