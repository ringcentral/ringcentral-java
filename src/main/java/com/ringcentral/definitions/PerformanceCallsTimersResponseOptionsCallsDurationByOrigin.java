package com.ringcentral.definitions;


public class PerformanceCallsTimersResponseOptionsCallsDurationByOrigin
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public PerformanceCallsTimersResponseOptionsCallsDurationByOrigin aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public PerformanceCallsTimersResponseOptionsCallsDurationByOrigin aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}