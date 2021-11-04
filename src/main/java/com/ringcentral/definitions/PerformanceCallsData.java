package com.ringcentral.definitions;


public class PerformanceCallsData {
    /**
     *
     */
    public PerformanceCallsTimers timers;
    /**
     *
     */
    public PerformanceCallsCounters counters;

    public PerformanceCallsData timers(PerformanceCallsTimers timers) {
        this.timers = timers;
        return this;
    }

    public PerformanceCallsData counters(PerformanceCallsCounters counters) {
        this.counters = counters;
        return this;
    }
}
