package com.ringcentral.definitions;


public class TimelineRequest {
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
    public TimelineResponseOptions responseOptions;

    public TimelineRequest grouping(Grouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public TimelineRequest timeSettings(TimeSettings timeSettings) {
        this.timeSettings = timeSettings;
        return this;
    }

    public TimelineRequest callFilters(CallFilters callFilters) {
        this.callFilters = callFilters;
        return this;
    }

    public TimelineRequest responseOptions(TimelineResponseOptions responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }
}
