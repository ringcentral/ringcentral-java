package com.ringcentral.definitions;


    /**
* Provides mapping of possible breakdown options for call aggregation time intervals
*/
public class PerformanceCallsResponseDataOptions
{
    /**
     */
    public PerformanceCallsCountersResponseOptions counters;
    public PerformanceCallsResponseDataOptions counters(PerformanceCallsCountersResponseOptions counters)
    {
        this.counters = counters;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptions timers;
    public PerformanceCallsResponseDataOptions timers(PerformanceCallsTimersResponseOptions timers)
    {
        this.timers = timers;
        return this;
    }
}