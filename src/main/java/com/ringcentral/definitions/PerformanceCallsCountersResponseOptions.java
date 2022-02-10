package com.ringcentral.definitions;


/**
 * Performance calls counters
 */
public class PerformanceCallsCountersResponseOptions {
    /**
     *
     */
    public PerformanceCallsCounter allCalls;
    /**
     *
     */
    public PerformanceCallsCounter callsByDirection;
    /**
     *
     */
    public PerformanceCallsCounter callsByOrigin;
    /**
     *
     */
    public PerformanceCallsCounter callsByResponse;
    /**
     *
     */
    public PerformanceCallsCounter callsByType;
    /**
     *
     */
    public PerformanceCallsCounter callsBySegments;
    /**
     *
     */
    public PerformanceCallsCounter callsByResult;
    /**
     *
     */
    public PerformanceCallsCounter callsByActions;
    /**
     *
     */
    public PerformanceCallsCounter callsByCompanyHours;
    /**
     *
     */
    public PerformanceCallsCounter callsByQueueSla;

    public PerformanceCallsCountersResponseOptions allCalls(PerformanceCallsCounter allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByDirection(PerformanceCallsCounter callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByOrigin(PerformanceCallsCounter callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByResponse(PerformanceCallsCounter callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByType(PerformanceCallsCounter callsByType) {
        this.callsByType = callsByType;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsBySegments(PerformanceCallsCounter callsBySegments) {
        this.callsBySegments = callsBySegments;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByResult(PerformanceCallsCounter callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByActions(PerformanceCallsCounter callsByActions) {
        this.callsByActions = callsByActions;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByCompanyHours(PerformanceCallsCounter callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsByQueueSla(PerformanceCallsCounter callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }
}
