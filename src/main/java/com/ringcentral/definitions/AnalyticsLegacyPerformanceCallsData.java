package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsData {
    /**
     * Grouping key
     * Required
     */
    public String key;
    /**
     *
     */
    public AnalyticsLegacyKeyInfo keyInfo;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimers timers;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCounters counters;

    public AnalyticsLegacyPerformanceCallsData key(String key) {
        this.key = key;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsData keyInfo(AnalyticsLegacyKeyInfo keyInfo) {
        this.keyInfo = keyInfo;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsData timers(AnalyticsLegacyPerformanceCallsTimers timers) {
        this.timers = timers;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsData counters(AnalyticsLegacyPerformanceCallsCounters counters) {
        this.counters = counters;
        return this;
    }
}
