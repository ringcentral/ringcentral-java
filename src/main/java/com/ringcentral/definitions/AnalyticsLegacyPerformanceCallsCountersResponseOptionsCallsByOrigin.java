package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByOrigin {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByOrigin aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByOrigin aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
