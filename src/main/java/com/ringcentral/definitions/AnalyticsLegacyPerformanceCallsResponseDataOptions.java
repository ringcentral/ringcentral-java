package com.ringcentral.definitions;


    /**
* This field provides mapping of possible breakdown options for call aggregation and aggregation formula
*/
public class AnalyticsLegacyPerformanceCallsResponseDataOptions
{
    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions counters;
    public AnalyticsLegacyPerformanceCallsResponseDataOptions counters(AnalyticsLegacyPerformanceCallsCountersResponseOptions counters)
    {
        this.counters = counters;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions timers;
    public AnalyticsLegacyPerformanceCallsResponseDataOptions timers(AnalyticsLegacyPerformanceCallsTimersResponseOptions timers)
    {
        this.timers = timers;
        return this;
    }
}