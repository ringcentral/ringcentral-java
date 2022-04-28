package com.ringcentral.definitions;


public class PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
