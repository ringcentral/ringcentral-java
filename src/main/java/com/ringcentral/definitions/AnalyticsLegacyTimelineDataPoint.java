package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineDataPoint
{
    /**
     * Required
     * Format: date-time
     */
    public String time;
    public AnalyticsLegacyTimelineDataPoint time(String time)
    {
        this.time = time;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimers timers;
    public AnalyticsLegacyTimelineDataPoint timers(AnalyticsLegacyPerformanceCallsTimers timers)
    {
        this.timers = timers;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCounters counters;
    public AnalyticsLegacyTimelineDataPoint counters(AnalyticsLegacyPerformanceCallsCounters counters)
    {
        this.counters = counters;
        return this;
    }
}