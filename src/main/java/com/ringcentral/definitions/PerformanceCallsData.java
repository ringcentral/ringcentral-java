package com.ringcentral.definitions;


/**
 * A list of call aggregations as per the grouping and filtering options specified in the request.
 */
public class PerformanceCallsData {
    /**
     * Grouping key
     * Required
     */
    public String key;
    /**
     *
     */
    public PerformanceCallsKeyInfo keyInfo;
    /**
     *
     */
    public PerformanceCallsTimers timers;
    /**
     *
     */
    public PerformanceCallsCounters counters;

    public PerformanceCallsData key(String key) {
        this.key = key;
        return this;
    }

    public PerformanceCallsData keyInfo(PerformanceCallsKeyInfo keyInfo) {
        this.keyInfo = keyInfo;
        return this;
    }

    public PerformanceCallsData timers(PerformanceCallsTimers timers) {
        this.timers = timers;
        return this;
    }

    public PerformanceCallsData counters(PerformanceCallsCounters counters) {
        this.counters = counters;
        return this;
    }
}
