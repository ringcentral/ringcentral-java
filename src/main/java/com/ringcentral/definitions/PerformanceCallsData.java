package com.ringcentral.definitions;


public class PerformanceCallsData {
    /**
     * Grouping key
     * Required
     */
    public String key;
    /**
     *
     */
    public KeyInfo keyInfo;
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

    public PerformanceCallsData keyInfo(KeyInfo keyInfo) {
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
