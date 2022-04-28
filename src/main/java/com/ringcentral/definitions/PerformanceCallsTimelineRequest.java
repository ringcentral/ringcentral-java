package com.ringcentral.definitions;


public class PerformanceCallsTimelineRequest {
    /**
     *
     */
    public PerformanceCallsGrouping grouping;
    /**
     * Required
     */
    public PerformanceCallsTimeSettings timeSettings;
    /**
     *
     */
    public PerformanceCallsFilters additionalFilters;
    /**
     * Required
     */
    public TimelineResponseDataOptions responseOptions;

    public PerformanceCallsTimelineRequest grouping(PerformanceCallsGrouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public PerformanceCallsTimelineRequest timeSettings(PerformanceCallsTimeSettings timeSettings) {
        this.timeSettings = timeSettings;
        return this;
    }

    public PerformanceCallsTimelineRequest additionalFilters(PerformanceCallsFilters additionalFilters) {
        this.additionalFilters = additionalFilters;
        return this;
    }

    public PerformanceCallsTimelineRequest responseOptions(TimelineResponseDataOptions responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }
}
