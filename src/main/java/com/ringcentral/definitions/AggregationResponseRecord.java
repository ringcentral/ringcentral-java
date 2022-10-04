package com.ringcentral.definitions;


public class AggregationResponseRecord {
    /**
     * Grouping key
     * Required
     */
    public String key;
    /**
     *
     */
    public KeyInfo info;
    /**
     *
     */
    public CallsTimers timers;
    /**
     *
     */
    public CallsCounters counters;

    public AggregationResponseRecord key(String key) {
        this.key = key;
        return this;
    }

    public AggregationResponseRecord info(KeyInfo info) {
        this.info = info;
        return this;
    }

    public AggregationResponseRecord timers(CallsTimers timers) {
        this.timers = timers;
        return this;
    }

    public AggregationResponseRecord counters(CallsCounters counters) {
        this.counters = counters;
        return this;
    }
}
