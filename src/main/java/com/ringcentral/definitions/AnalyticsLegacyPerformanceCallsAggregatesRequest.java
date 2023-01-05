package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsAggregatesRequest
{
    /**
     */
    public AnalyticsLegacyPerformanceCallsGrouping grouping;
    public AnalyticsLegacyPerformanceCallsAggregatesRequest grouping(AnalyticsLegacyPerformanceCallsGrouping grouping)
    {
        this.grouping = grouping;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyPerformanceCallsTimeSettings timeSettings;
    public AnalyticsLegacyPerformanceCallsAggregatesRequest timeSettings(AnalyticsLegacyPerformanceCallsTimeSettings timeSettings)
    {
        this.timeSettings = timeSettings;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsFilters additionalFilters;
    public AnalyticsLegacyPerformanceCallsAggregatesRequest additionalFilters(AnalyticsLegacyPerformanceCallsFilters additionalFilters)
    {
        this.additionalFilters = additionalFilters;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyPerformanceCallsResponseDataOptions responseOptions;
    public AnalyticsLegacyPerformanceCallsAggregatesRequest responseOptions(AnalyticsLegacyPerformanceCallsResponseDataOptions responseOptions)
    {
        this.responseOptions = responseOptions;
        return this;
    }
}