package com.ringcentral.definitions;


// Performance calls counters
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
    public PerformanceCallsCounter callsByResponseType;
    /**
     *
     */
    public PerformanceCallsCounter callsBySegment;
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

    public PerformanceCallsCountersResponseOptions callsByResponseType(PerformanceCallsCounter callsByResponseType) {
        this.callsByResponseType = callsByResponseType;
        return this;
    }

    public PerformanceCallsCountersResponseOptions callsBySegment(PerformanceCallsCounter callsBySegment) {
        this.callsBySegment = callsBySegment;
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
}
