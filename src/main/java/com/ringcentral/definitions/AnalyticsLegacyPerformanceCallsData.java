package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsData
{
    /**
     * Grouping key
     * Required
     */
    public String key;
    public AnalyticsLegacyPerformanceCallsData key(String key)
    {
        this.key = key;
        return this;
    }

    /**
     */
    public AnalyticsLegacyKeyInfo keyInfo;
    public AnalyticsLegacyPerformanceCallsData keyInfo(AnalyticsLegacyKeyInfo keyInfo)
    {
        this.keyInfo = keyInfo;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimers timers;
    public AnalyticsLegacyPerformanceCallsData timers(AnalyticsLegacyPerformanceCallsTimers timers)
    {
        this.timers = timers;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCounters counters;
    public AnalyticsLegacyPerformanceCallsData counters(AnalyticsLegacyPerformanceCallsCounters counters)
    {
        this.counters = counters;
        return this;
    }
}