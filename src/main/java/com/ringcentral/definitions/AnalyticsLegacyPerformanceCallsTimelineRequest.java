package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimelineRequest
{
    /**
     */
    public AnalyticsLegacyPerformanceCallsGrouping grouping;
    public AnalyticsLegacyPerformanceCallsTimelineRequest grouping(AnalyticsLegacyPerformanceCallsGrouping grouping)
    {
        this.grouping = grouping;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyPerformanceCallsTimeSettings timeSettings;
    public AnalyticsLegacyPerformanceCallsTimelineRequest timeSettings(AnalyticsLegacyPerformanceCallsTimeSettings timeSettings)
    {
        this.timeSettings = timeSettings;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsFilters additionalFilters;
    public AnalyticsLegacyPerformanceCallsTimelineRequest additionalFilters(AnalyticsLegacyPerformanceCallsFilters additionalFilters)
    {
        this.additionalFilters = additionalFilters;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyTimelineResponseDataOptions responseOptions;
    public AnalyticsLegacyPerformanceCallsTimelineRequest responseOptions(AnalyticsLegacyTimelineResponseDataOptions responseOptions)
    {
        this.responseOptions = responseOptions;
        return this;
    }
}