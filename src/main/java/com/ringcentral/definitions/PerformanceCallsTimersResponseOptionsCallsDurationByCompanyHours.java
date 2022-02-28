package com.ringcentral.definitions;


public class PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}