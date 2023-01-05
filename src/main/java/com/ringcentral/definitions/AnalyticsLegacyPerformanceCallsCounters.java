package com.ringcentral.definitions;


    /**
* Call volume data for the specified grouping
*/
public class AnalyticsLegacyPerformanceCallsCounters
{
    /**
     */
    public AnalyticsLegacyPerformanceCallsTotal allCalls;
    public AnalyticsLegacyPerformanceCallsCounters allCalls(AnalyticsLegacyPerformanceCallsTotal allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByDirection callsByDirection;
    public AnalyticsLegacyPerformanceCallsCounters callsByDirection(AnalyticsLegacyPerformanceCallsByDirection callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByOrigin callsByOrigin;
    public AnalyticsLegacyPerformanceCallsCounters callsByOrigin(AnalyticsLegacyPerformanceCallsByOrigin callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByResponse callsByResponse;
    public AnalyticsLegacyPerformanceCallsCounters callsByResponse(AnalyticsLegacyPerformanceCallsByResponse callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsSegments callsSegments;
    public AnalyticsLegacyPerformanceCallsCounters callsSegments(AnalyticsLegacyPerformanceCallsSegments callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByResult callsByResult;
    public AnalyticsLegacyPerformanceCallsCounters callsByResult(AnalyticsLegacyPerformanceCallsByResult callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsActions callsActions;
    public AnalyticsLegacyPerformanceCallsCounters callsActions(AnalyticsLegacyPerformanceCallsActions callsActions)
    {
        this.callsActions = callsActions;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByCompanyHours callsByCompanyHours;
    public AnalyticsLegacyPerformanceCallsCounters callsByCompanyHours(AnalyticsLegacyPerformanceCallsByCompanyHours callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByQueueSla callsByQueueSla;
    public AnalyticsLegacyPerformanceCallsCounters callsByQueueSla(AnalyticsLegacyPerformanceCallsByQueueSla callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsByType callsByType;
    public AnalyticsLegacyPerformanceCallsCounters callsByType(AnalyticsLegacyPerformanceCallsByType callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }
}