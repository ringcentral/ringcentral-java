package com.ringcentral.definitions;


public class PerformanceCallsCountersResponseOptionsCallsByResult {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsCountersResponseOptionsCallsByResult aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsCountersResponseOptionsCallsByResult aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
