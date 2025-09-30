package com.ringcentral.definitions;


/**
 * The formula is defined by `aggregationType` and `aggregationInterval` for every counter individually.
 * If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
 * If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is required
 */
public class AggregationResponseOptionsCounters {
    /**
     * Aggregation of all calls count
     */
    public AggregationResponseOptionsCountersAllCalls allCalls;
    /**
     * Aggregation of calls count by direction (Inbound, Outbound)
     */
    public AggregationResponseOptionsCountersCallsByDirection callsByDirection;
    /**
     * Aggregation of calls count by origin (Internal, External)
     */
    public AggregationResponseOptionsCountersCallsByOrigin callsByOrigin;
    /**
     * Aggregation of calls count by response (Answered, NotAnswered, Connected, NotConnected)
     */
    public AggregationResponseOptionsCountersCallsByResponse callsByResponse;
    /**
     * Aggregation of calls count by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
     */
    public AggregationResponseOptionsCountersCallsSegments callsSegments;
    /**
     * Aggregation of calls count by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted, Transferred, PickedUp, AnsweredElsewhere)
     */
    public AggregationResponseOptionsCountersCallsByResult callsByResult;
    /**
     * Aggregation of calls count by company hours (BusinessHours, AfterHours)
     */
    public AggregationResponseOptionsCountersCallsByCompanyHours callsByCompanyHours;
    /**
     * Aggregation of calls count by queue SLA (InSLA, OutSLA). This counter is only applicable to Queues grouping
     */
    public AggregationResponseOptionsCountersCallsByQueueSla callsByQueueSla;
    /**
     * Aggregation of calls count by action (HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer)
     */
    public AggregationResponseOptionsCountersCallsByActions callsByActions;
    /**
     * Aggregation of calls count by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound, QueueCallPickup)
     */
    public AggregationResponseOptionsCountersCallsByType callsByType;
    /**
     * Aggregation of calls count by party that ended the call (Caller, Callee, System)
     */
    public AggregationResponseOptionsCountersCallsByEndingParty callsByEndingParty;
    /**
     * Aggregation of calls count by the total number of times a Queue call was presented to the user. It is limited to `groupBy` Users and `groupByMembers` (Department, Queue, Site, UserGroup) grouping. Only the listed below options for call filters are applicable to `queueOpportunities` and provide meaningful results: `queues` (selected queue extension ids), `callResults` (Missed, Abandoned), `callResponses` (Answered, NotAnswered), `origins` (Internal, External)
     */
    public AggregationResponseOptionsCountersQueueOpportunities queueOpportunities;
    /**
     * Aggregation of calls count by queue hours (BusinessHours, AfterHours)
     */
    public AggregationResponseOptionsCountersCallsByQueueHours callsByQueueHours;

    public AggregationResponseOptionsCounters allCalls(AggregationResponseOptionsCountersAllCalls allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public AggregationResponseOptionsCounters callsByDirection(AggregationResponseOptionsCountersCallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public AggregationResponseOptionsCounters callsByOrigin(AggregationResponseOptionsCountersCallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public AggregationResponseOptionsCounters callsByResponse(AggregationResponseOptionsCountersCallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public AggregationResponseOptionsCounters callsSegments(AggregationResponseOptionsCountersCallsSegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public AggregationResponseOptionsCounters callsByResult(AggregationResponseOptionsCountersCallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public AggregationResponseOptionsCounters callsByCompanyHours(AggregationResponseOptionsCountersCallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public AggregationResponseOptionsCounters callsByQueueSla(AggregationResponseOptionsCountersCallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public AggregationResponseOptionsCounters callsByActions(AggregationResponseOptionsCountersCallsByActions callsByActions) {
        this.callsByActions = callsByActions;
        return this;
    }

    public AggregationResponseOptionsCounters callsByType(AggregationResponseOptionsCountersCallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }

    public AggregationResponseOptionsCounters callsByEndingParty(AggregationResponseOptionsCountersCallsByEndingParty callsByEndingParty) {
        this.callsByEndingParty = callsByEndingParty;
        return this;
    }

    public AggregationResponseOptionsCounters queueOpportunities(AggregationResponseOptionsCountersQueueOpportunities queueOpportunities) {
        this.queueOpportunities = queueOpportunities;
        return this;
    }

    public AggregationResponseOptionsCounters callsByQueueHours(AggregationResponseOptionsCountersCallsByQueueHours callsByQueueHours) {
        this.callsByQueueHours = callsByQueueHours;
        return this;
    }
}
