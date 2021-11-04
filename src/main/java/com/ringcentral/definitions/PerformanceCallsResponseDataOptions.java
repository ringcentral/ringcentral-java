package com.ringcentral.definitions;


// Provides mapping of possible breakdown options for call aggregation and aggregation formula
public class PerformanceCallsResponseDataOptions {
    /**
     *
     */
    public PerformanceCallsCountersResponseOptions counters;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptions timers;

    public PerformanceCallsResponseDataOptions counters(PerformanceCallsCountersResponseOptions counters) {
        this.counters = counters;
        return this;
    }

    public PerformanceCallsResponseDataOptions timers(PerformanceCallsTimersResponseOptions timers) {
        this.timers = timers;
        return this;
    }
}
