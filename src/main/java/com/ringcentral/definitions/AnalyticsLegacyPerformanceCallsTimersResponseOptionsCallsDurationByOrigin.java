package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
