package com.ringcentral.definitions;


public class PerformanceCallsTimersResponseOptionsCallsDurationByResponse {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsTimersResponseOptionsCallsDurationByResponse aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsTimersResponseOptionsCallsDurationByResponse aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
