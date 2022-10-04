package com.ringcentral.definitions;


/**
 * Call length data for the specified grouping
 */
public class CallsTimers {
    /**
     *
     */
    public AllCalls allCalls;
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
    public CallsBySegments callsSegments;
    /**
     *
     */
    public CallsByResult callsByResult;
    /**
     *
     */
    public CallsByCompanyHours callsByCompanyHours;
    /**
     *
     */
    public CallsByQueueSla callsByQueueSla;
    /**
     *
     */
    public CallsByType callsByType;

    public CallsTimers allCalls(AllCalls allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public CallsTimers callsByDirection(CallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public CallsTimers callsByOrigin(CallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public CallsTimers callsByResponse(CallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public CallsTimers callsSegments(CallsBySegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public CallsTimers callsByResult(CallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public CallsTimers callsByCompanyHours(CallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public CallsTimers callsByQueueSla(CallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public CallsTimers callsByType(CallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
