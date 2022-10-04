package com.ringcentral.definitions;


public class TimelineResponsePoint {
    /**
     * Time point in RFC 3339 format
     * Required
     * Format: date-time
     */
    public String time;
    /**
     *
     */
    public CallsTimers timers;
    /**
     *
     */
    public CallsCounters counters;

    public TimelineResponsePoint time(String time) {
        this.time = time;
        return this;
    }

    public TimelineResponsePoint timers(CallsTimers timers) {
        this.timers = timers;
        return this;
    }

    public TimelineResponsePoint counters(CallsCounters counters) {
        this.counters = counters;
        return this;
    }
}
