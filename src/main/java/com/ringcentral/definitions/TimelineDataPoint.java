package com.ringcentral.definitions;


public class TimelineDataPoint {
    /**
     * Required
     * Format: date-time
     */
    public String time;
    /**
     *
     */
    public PerformanceCallsTimers timers;
    /**
     *
     */
    public PerformanceCallsCounters counters;

    public TimelineDataPoint time(String time) {
        this.time = time;
        return this;
    }

    public TimelineDataPoint timers(PerformanceCallsTimers timers) {
        this.timers = timers;
        return this;
    }

    public TimelineDataPoint counters(PerformanceCallsCounters counters) {
        this.counters = counters;
        return this;
    }
}
