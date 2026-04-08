package com.ringcentral.definitions;


public class TimelineRequest
{
    /**
     * Required
     */
    public Grouping grouping;
    public TimelineRequest grouping(Grouping grouping)
    {
        this.grouping = grouping;
        return this;
    }

    /**
     * Required
     */
    public TimeSettings timeSettings;
    public TimelineRequest timeSettings(TimeSettings timeSettings)
    {
        this.timeSettings = timeSettings;
        return this;
    }

    /**
     */
    public CallFilters callFilters;
    public TimelineRequest callFilters(CallFilters callFilters)
    {
        this.callFilters = callFilters;
        return this;
    }

    /**
     * Required
     */
    public TimelineResponseOptions responseOptions;
    public TimelineRequest responseOptions(TimelineResponseOptions responseOptions)
    {
        this.responseOptions = responseOptions;
        return this;
    }
}