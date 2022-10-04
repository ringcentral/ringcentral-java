package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsAggregatesRequest {
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsGrouping grouping;
    /**
     * Required
     */
    public AnalyticsLegacyPerformanceCallsTimeSettings timeSettings;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsFilters additionalFilters;
    /**
     * Required
     */
    public AnalyticsLegacyPerformanceCallsResponseDataOptions responseOptions;

    public AnalyticsLegacyPerformanceCallsAggregatesRequest grouping(AnalyticsLegacyPerformanceCallsGrouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsAggregatesRequest timeSettings(AnalyticsLegacyPerformanceCallsTimeSettings timeSettings) {
        this.timeSettings = timeSettings;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsAggregatesRequest additionalFilters(AnalyticsLegacyPerformanceCallsFilters additionalFilters) {
        this.additionalFilters = additionalFilters;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsAggregatesRequest responseOptions(AnalyticsLegacyPerformanceCallsResponseDataOptions responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }
}
