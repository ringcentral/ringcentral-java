package com.ringcentral.definitions;


/**
 * The formula is defined by `aggregationType` and `aggregationInterval` for every counter individually.
 * If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
 * If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is required
 */
public class PerformanceCallsCountersResponseOptions {
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsAllCalls allCalls;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsSegments callsSegments;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsByResult callsByResult;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours;
    /**
     * This counter is only applicable to Queues grouping
     */
    public PerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsByActions callsByActions;
    /**
     *
     */
    public PerformanceCallsCountersResponseOptionsCallsByType callsByType;

    public PerformanceCallsCountersResponseOptions allCalls(PerformanceCallsCountersResponseOptionsAllCalls allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByDirection(PerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByOrigin(PerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByResponse(PerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsSegments(PerformanceCallsCountersResponseOptionsCallsSegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByResult(PerformanceCallsCountersResponseOptionsCallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByCompanyHours(PerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByQueueSla(PerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByActions(PerformanceCallsCountersResponseOptionsCallsByActions callsByActions) {
        this.callsByActions = callsByActions;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByType(PerformanceCallsCountersResponseOptionsCallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
