package com.ringcentral.definitions;


public class AggregationRequest {
    /**
     * Required
     */
    public Grouping grouping;
    /**
     * Required
     */
    public TimeSettings timeSettings;
    /**
     *
     */
    public CallFilters callFilters;
    /**
     * Required
     */
    public AggregationResponseOptions responseOptions;

    public AggregationRequest grouping(Grouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public AggregationRequest timeSettings(TimeSettings timeSettings) {
        this.timeSettings = timeSettings;
        return this;
    }

    public AggregationRequest callFilters(CallFilters callFilters) {
        this.callFilters = callFilters;
        return this;
    }

    public AggregationRequest responseOptions(AggregationResponseOptions responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }
}
