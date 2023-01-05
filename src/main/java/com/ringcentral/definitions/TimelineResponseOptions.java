package com.ringcentral.definitions;


    /**
* Counters and timers options for calls breakdown
*/
public class TimelineResponseOptions
{
    /**
     */
    public TimelineResponseOptionsCounters counters;
    public TimelineResponseOptions counters(TimelineResponseOptionsCounters counters)
    {
        this.counters = counters;
        return this;
    }

    /**
     */
    public TimelineResponseOptionsTimers timers;
    public TimelineResponseOptions timers(TimelineResponseOptionsTimers timers)
    {
        this.timers = timers;
        return this;
    }
}