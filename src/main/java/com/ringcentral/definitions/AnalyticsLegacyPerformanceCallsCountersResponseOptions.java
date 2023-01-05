package com.ringcentral.definitions;


    /**
* The formula is defined by `aggregationType` and `aggregationInterval` for every counter individually.
* If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
* If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is required
*/
public class AnalyticsLegacyPerformanceCallsCountersResponseOptions
{
    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsAllCalls allCalls;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions allCalls(AnalyticsLegacyPerformanceCallsCountersResponseOptionsAllCalls allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByDirection(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByOrigin(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByResponse(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsSegments callsSegments;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsSegments(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsSegments callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResult callsByResult;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByResult(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResult callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByCompanyHours(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     * This counter is only applicable to Queues grouping
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByQueueSla(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByActions callsByActions;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByActions(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByActions callsByActions)
    {
        this.callsByActions = callsByActions;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByType callsByType;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByType(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByType callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }
}