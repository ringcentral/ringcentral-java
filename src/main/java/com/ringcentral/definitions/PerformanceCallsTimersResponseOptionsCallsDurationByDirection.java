package com.ringcentral.definitions;


public class PerformanceCallsTimersResponseOptionsCallsDurationByDirection {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsTimersResponseOptionsCallsDurationByDirection aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsTimersResponseOptionsCallsDurationByDirection aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
