package com.ringcentral.definitions;


public class PerformanceCallsCountersResponseOptionsCallsByOrigin {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsCountersResponseOptionsCallsByOrigin aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsCountersResponseOptionsCallsByOrigin aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
