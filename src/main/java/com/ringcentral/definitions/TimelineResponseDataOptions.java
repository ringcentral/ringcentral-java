package com.ringcentral.definitions;


/**
 * This field provides mapping of possible breakdown options for call aggregation time intervals
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
