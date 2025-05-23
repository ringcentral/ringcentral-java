package com.ringcentral.definitions;


/**
 * Call volume data for the specified grouping
 */
public class CallsCounters {
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
    public CallsByEndingParty callsByEndingParty;
    /**
     *
     */
    public CallsByActions callsActions;
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
    /**
     *
     */
    public QueueOpportunities queueOpportunities;

    public CallsCounters allCalls(AllCalls allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public CallsCounters callsByDirection(CallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public CallsCounters callsByOrigin(CallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public CallsCounters callsByResponse(CallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public CallsCounters callsSegments(CallsBySegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public CallsCounters callsByResult(CallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public CallsCounters callsByEndingParty(CallsByEndingParty callsByEndingParty) {
        this.callsByEndingParty = callsByEndingParty;
        return this;
    }

    public CallsCounters callsActions(CallsByActions callsActions) {
        this.callsActions = callsActions;
        return this;
    }

    public CallsCounters callsByCompanyHours(CallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public CallsCounters callsByQueueSla(CallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public CallsCounters callsByType(CallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }

    public CallsCounters queueOpportunities(QueueOpportunities queueOpportunities) {
        this.queueOpportunities = queueOpportunities;
        return this;
    }
}
