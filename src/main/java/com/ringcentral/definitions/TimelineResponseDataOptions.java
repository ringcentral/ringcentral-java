package com.ringcentral.definitions;


/**
 * This field provides mapping of possible breakdown options that will be used for aggregation within every time interval
 */
public class TimelineResponseDataOptions {
    /**
     *
     */
    public TimelineCountersResponseOptions counters;
    /**
     *
     */
    public TimelineTimersResponseOptions timers;

    public TimelineResponseDataOptions counters(TimelineCountersResponseOptions counters) {
        this.counters = counters;
        return this;
    }

    public TimelineResponseDataOptions timers(TimelineTimersResponseOptions timers) {
        this.timers = timers;
        return this;
    }
}
