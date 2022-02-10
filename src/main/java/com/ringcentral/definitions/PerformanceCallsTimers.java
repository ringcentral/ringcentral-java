package com.ringcentral.definitions;


/**
 * Call length data for the specified grouping.
 */
public class PerformanceCallsTimers {
    /**
     *
     */
    public PerformanceCallsTotal allCalls;
    /**
     *
     */
    public PerformanceCallsByDirection callsByDirection;
    /**
     *
     */
    public PerformanceCallsByOrigin callsByOrigin;
    /**
     *
     */
    public PerformanceCallsByResponse callsByResponse;
    /**
     *
     */
    public PerformanceCallsSegments callsSegments;
    /**
     *
     */
    public PerformanceCallsByResult callsByResult;
    /**
     *
     */
    public PerformanceCallsByCompanyHours callsByCompanyHours;
    /**
     *
     */
    public PerformanceCallsByQueueSla callsByQueueSla;
    /**
     *
     */
    public PerformanceCallsByType callsByType;

    public PerformanceCallsTimers allCalls(PerformanceCallsTotal allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public PerformanceCallsTimers callsByDirection(PerformanceCallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public PerformanceCallsTimers callsByOrigin(PerformanceCallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public PerformanceCallsTimers callsByResponse(PerformanceCallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public PerformanceCallsTimers callsSegments(PerformanceCallsSegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public PerformanceCallsTimers callsByResult(PerformanceCallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public PerformanceCallsTimers callsByCompanyHours(PerformanceCallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public PerformanceCallsTimers callsByQueueSla(PerformanceCallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public PerformanceCallsTimers callsByType(PerformanceCallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
