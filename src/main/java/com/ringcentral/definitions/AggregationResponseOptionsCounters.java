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
     * Aggregation of calls count by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted)
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
     * Aggregation of calls count by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound)
     */
    public AggregationResponseOptionsCountersCallsByType callsByType;

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
}
