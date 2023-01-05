package com.ringcentral.definitions;


public class AggregationRequest
{
    /**
     * Required
     */
    public Grouping grouping;
    public AggregationRequest grouping(Grouping grouping)
    {
        this.grouping = grouping;
        return this;
    }

    /**
     * Required
     */
    public TimeSettings timeSettings;
    public AggregationRequest timeSettings(TimeSettings timeSettings)
    {
        this.timeSettings = timeSettings;
        return this;
    }

    /**
     */
    public CallFilters callFilters;
    public AggregationRequest callFilters(CallFilters callFilters)
    {
        this.callFilters = callFilters;
        return this;
    }

    /**
     * Required
     */
    public AggregationResponseOptions responseOptions;
    public AggregationRequest responseOptions(AggregationResponseOptions responseOptions)
    {
        this.responseOptions = responseOptions;
        return this;
    }
}