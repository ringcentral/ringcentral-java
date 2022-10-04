package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsSegments {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsSegments aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsSegments aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
