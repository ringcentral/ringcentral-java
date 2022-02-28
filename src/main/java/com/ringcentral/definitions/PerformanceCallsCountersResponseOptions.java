package com.ringcentral.definitions;


    /**
* The formula is defined by `aggregationType` and `aggregationInterval` for every counter individually. If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported. If `aggregationType` is `Min`, `Max` or `Average`,`aggregationInterval` is required
*/
public class PerformanceCallsCountersResponseOptions
{
    /**
     */
    public PerformanceCallsCountersResponseOptionsAllCalls allCalls;
    public PerformanceCallsCountersResponseOptions allCalls(PerformanceCallsCountersResponseOptionsAllCalls allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection;
    public PerformanceCallsCountersResponseOptions callsByDirection(PerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin;
    public PerformanceCallsCountersResponseOptions callsByOrigin(PerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse;
    public PerformanceCallsCountersResponseOptions callsByResponse(PerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsSegments callsSegments;
    public PerformanceCallsCountersResponseOptions callsSegments(PerformanceCallsCountersResponseOptionsCallsSegments callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsByResult callsByResult;
    public PerformanceCallsCountersResponseOptions callsByResult(PerformanceCallsCountersResponseOptionsCallsByResult callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours;
    public PerformanceCallsCountersResponseOptions callsByCompanyHours(PerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     * This counter is only applicable to Queues grouping
     */
    public PerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla;
    public PerformanceCallsCountersResponseOptions callsByQueueSla(PerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsByActions callsByActions;
    public PerformanceCallsCountersResponseOptions callsByActions(PerformanceCallsCountersResponseOptionsCallsByActions callsByActions)
    {
        this.callsByActions = callsByActions;
        return this;
    }

    /**
     */
    public PerformanceCallsCountersResponseOptionsCallsByType callsByType;
    public PerformanceCallsCountersResponseOptions callsByType(PerformanceCallsCountersResponseOptionsCallsByType callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }
}