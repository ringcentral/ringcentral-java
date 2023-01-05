package com.ringcentral.definitions;


    /**
* This field provides mapping of possible breakdown options that will be used for aggregation within every time interval
*/
public class AnalyticsLegacyTimelineResponseDataOptions
{
    /**
     */
    public AnalyticsLegacyTimelineCountersResponseOptions counters;
    public AnalyticsLegacyTimelineResponseDataOptions counters(AnalyticsLegacyTimelineCountersResponseOptions counters)
    {
        this.counters = counters;
        return this;
    }

    /**
     */
    public AnalyticsLegacyTimelineTimersResponseOptions timers;
    public AnalyticsLegacyTimelineResponseDataOptions timers(AnalyticsLegacyTimelineTimersResponseOptions timers)
    {
        this.timers = timers;
        return this;
    }
}