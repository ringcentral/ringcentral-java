package com.ringcentral.definitions;


    /**
* Call length data for the specified grouping
*/
public class AnalyticsLegacyPerformanceCallsTimers
{
    /**
     */
    public AnalyticsLegacyPerformanceCallsTotal allCalls;
    public AnalyticsLegacyPerformanceCallsTimers allCalls(AnalyticsLegacyPerformanceCallsTotal allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByDirection callsByDirection;
    public AnalyticsLegacyPerformanceCallsTimers callsByDirection(AnalyticsLegacyPerformanceCallsByDirection callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByOrigin callsByOrigin;
    public AnalyticsLegacyPerformanceCallsTimers callsByOrigin(AnalyticsLegacyPerformanceCallsByOrigin callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByResponse callsByResponse;
    public AnalyticsLegacyPerformanceCallsTimers callsByResponse(AnalyticsLegacyPerformanceCallsByResponse callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsSegments callsSegments;
    public AnalyticsLegacyPerformanceCallsTimers callsSegments(AnalyticsLegacyPerformanceCallsSegments callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByResult callsByResult;
    public AnalyticsLegacyPerformanceCallsTimers callsByResult(AnalyticsLegacyPerformanceCallsByResult callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByCompanyHours callsByCompanyHours;
    public AnalyticsLegacyPerformanceCallsTimers callsByCompanyHours(AnalyticsLegacyPerformanceCallsByCompanyHours callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByQueueSla callsByQueueSla;
    public AnalyticsLegacyPerformanceCallsTimers callsByQueueSla(AnalyticsLegacyPerformanceCallsByQueueSla callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByType callsByType;
    public AnalyticsLegacyPerformanceCallsTimers callsByType(AnalyticsLegacyPerformanceCallsByType callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }
}