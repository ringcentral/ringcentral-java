package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
