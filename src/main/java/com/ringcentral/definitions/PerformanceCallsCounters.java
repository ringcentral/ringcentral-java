package com.ringcentral.definitions;


/**
 * Call volume data for the specified grouping.
 */
public class PerformanceCallsCounters {
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
    public PerformanceCallsActions callsActions;
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

    public PerformanceCallsCounters allCalls(PerformanceCallsTotal allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public PerformanceCallsCounters callsByDirection(PerformanceCallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public PerformanceCallsCounters callsByOrigin(PerformanceCallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public PerformanceCallsCounters callsByResponse(PerformanceCallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public PerformanceCallsCounters callsSegments(PerformanceCallsSegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public PerformanceCallsCounters callsByResult(PerformanceCallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public PerformanceCallsCounters callsActions(PerformanceCallsActions callsActions) {
        this.callsActions = callsActions;
        return this;
    }

    public PerformanceCallsCounters callsByCompanyHours(PerformanceCallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public PerformanceCallsCounters callsByQueueSla(PerformanceCallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public PerformanceCallsCounters callsByType(PerformanceCallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
