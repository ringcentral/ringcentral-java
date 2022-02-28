package com.ringcentral.definitions;


public class TimelineCountersResponseOptions {
    /**
     *
     */
    public Boolean allCalls;
    /**
     *
     */
    public Boolean callsByDirection;
    /**
     *
     */
    public Boolean callsByOrigin;
    /**
     *
     */
    public Boolean callsByResponse;
    /**
     *
     */
    public Boolean callsSegments;
    /**
     *
     */
    public Boolean callsByResult;
    /**
     *
     */
    public Boolean callsByCompanyHours;
    /**
     * This counter is only applicable to Queues grouping
     */
    public Boolean callsByQueueSla;
    /**
     *
     */
    public Boolean callsByActions;
    /**
     *
     */
    public Boolean callsByType;

    public TimelineCountersResponseOptions allCalls(Boolean allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public TimelineCountersResponseOptions callsByDirection(Boolean callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public TimelineCountersResponseOptions callsByOrigin(Boolean callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public TimelineCountersResponseOptions callsByResponse(Boolean callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public TimelineCountersResponseOptions callsSegments(Boolean callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public TimelineCountersResponseOptions callsByResult(Boolean callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public TimelineCountersResponseOptions callsByCompanyHours(Boolean callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public TimelineCountersResponseOptions callsByQueueSla(Boolean callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public TimelineCountersResponseOptions callsByActions(Boolean callsByActions) {
        this.callsByActions = callsByActions;
        return this;
    }

    public TimelineCountersResponseOptions callsByType(Boolean callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
