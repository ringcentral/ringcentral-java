package com.ringcentral.definitions;


// Call volume data for the specified grouping.
public class PerformanceCallsCounters {
    /**
     * Format: int64
     */
    public Long totalCalls;
    /**
     *
     */
    public CallsByDirection callsByDirection;
    /**
     *
     */
    public CallsByOrigin callsByOrigin;
    /**
     *
     */
    public CallsByResponse callsByResponse;
    /**
     *
     */
    public CallsByResponseType callsByResponseType;
    /**
     *
     */
    public CallsByResult callsByResult;
    /**
     *
     */
    public CallsActionsCount callsActionsCount;
    /**
     *
     */
    public CallsBySegments callsBySegments;
    /**
     *
     */
    public CallsByCompanyHours callsByCompanyHours;

    public PerformanceCallsCounters totalCalls(Long totalCalls) {
        this.totalCalls = totalCalls;
        return this;
    }

    public PerformanceCallsCounters callsByDirection(CallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public PerformanceCallsCounters callsByOrigin(CallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public PerformanceCallsCounters callsByResponse(CallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public PerformanceCallsCounters callsByResponseType(CallsByResponseType callsByResponseType) {
        this.callsByResponseType = callsByResponseType;
        return this;
    }

    public PerformanceCallsCounters callsByResult(CallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public PerformanceCallsCounters callsActionsCount(CallsActionsCount callsActionsCount) {
        this.callsActionsCount = callsActionsCount;
        return this;
    }

    public PerformanceCallsCounters callsBySegments(CallsBySegments callsBySegments) {
        this.callsBySegments = callsBySegments;
        return this;
    }

    public PerformanceCallsCounters callsByCompanyHours(CallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }
}
