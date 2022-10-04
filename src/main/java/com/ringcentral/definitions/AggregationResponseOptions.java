package com.ringcentral.definitions;


/**
 * This field provides mapping of possible breakdown options for call aggregation and aggregation formula
 */
public class AggregationResponseOptions {
    /**
     *
     */
    public AggregationResponseOptionsCounters counters;
    /**
     *
     */
    public AggregationResponseOptionsTimers timers;

    public AggregationResponseOptions counters(AggregationResponseOptionsCounters counters) {
        this.counters = counters;
        return this;
    }

    public AggregationResponseOptions timers(AggregationResponseOptionsTimers timers) {
        this.timers = timers;
        return this;
    }
}
