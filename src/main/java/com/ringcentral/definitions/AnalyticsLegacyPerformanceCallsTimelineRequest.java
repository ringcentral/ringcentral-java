package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimelineRequest {
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
    public AnalyticsLegacyTimelineResponseDataOptions responseOptions;

    public AnalyticsLegacyPerformanceCallsTimelineRequest grouping(AnalyticsLegacyPerformanceCallsGrouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimelineRequest timeSettings(AnalyticsLegacyPerformanceCallsTimeSettings timeSettings) {
        this.timeSettings = timeSettings;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimelineRequest additionalFilters(AnalyticsLegacyPerformanceCallsFilters additionalFilters) {
        this.additionalFilters = additionalFilters;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimelineRequest responseOptions(AnalyticsLegacyTimelineResponseDataOptions responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }
}
