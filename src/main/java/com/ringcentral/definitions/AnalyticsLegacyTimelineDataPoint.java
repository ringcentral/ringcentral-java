package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineDataPoint {
    /**
     * Required
     * Format: date-time
     */
    public String time;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimers timers;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCounters counters;

    public AnalyticsLegacyTimelineDataPoint time(String time) {
        this.time = time;
        return this;
    }

    public AnalyticsLegacyTimelineDataPoint timers(AnalyticsLegacyPerformanceCallsTimers timers) {
        this.timers = timers;
        return this;
    }

    public AnalyticsLegacyTimelineDataPoint counters(AnalyticsLegacyPerformanceCallsCounters counters) {
        this.counters = counters;
        return this;
    }
}
