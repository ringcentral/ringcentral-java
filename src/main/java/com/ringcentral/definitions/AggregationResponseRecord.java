package com.ringcentral.definitions;


public class AggregationResponseRecord
{
    /**
     * Grouping key
     * Required
     */
    public String key;
    public AggregationResponseRecord key(String key)
    {
        this.key = key;
        return this;
    }

    /**
     */
    public KeyInfo info;
    public AggregationResponseRecord info(KeyInfo info)
    {
        this.info = info;
        return this;
    }

    /**
     */
    public CallsTimers timers;
    public AggregationResponseRecord timers(CallsTimers timers)
    {
        this.timers = timers;
        return this;
    }

    /**
     */
    public CallsCounters counters;
    public AggregationResponseRecord counters(CallsCounters counters)
    {
        this.counters = counters;
        return this;
    }
}