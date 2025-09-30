package com.ringcentral.definitions;


/**
 * The formula is defined by `aggregationType` and `aggregationInterval` for every timer individually.
 * If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
 * If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is supported, but not required.
 * If left empty, aggregation will be performed on per-call basis
 */
public class AggregationResponseOptionsTimers {
    /**
     * Aggregation of all calls duration
     */
    public AggregationResponseOptionsTimersAllCallsDuration allCallsDuration;
    /**
     * Aggregation of calls duration by direction (Inbound, Outbound)
     */
    public AggregationResponseOptionsTimersCallsDurationByDirection callsDurationByDirection;
    /**
     * Aggregation of calls duration by origin (Internal, External)
     */
    public AggregationResponseOptionsTimersCallsDurationByOrigin callsDurationByOrigin;
    /**
     * Aggregation of calls duration by response (Answered, NotAnswered, Connected, NotConnected)
     */
    public AggregationResponseOptionsTimersCallsDurationByResponse callsDurationByResponse;
    /**
     * Aggregation of calls duration by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
     */
    public AggregationResponseOptionsTimersCallsSegmentsDuration callsSegmentsDuration;
    /**
     * Aggregation of calls duration by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted, Transferred, PickedUp, AnsweredElsewhere)
     */
    public AggregationResponseOptionsTimersCallsDurationByResult callsDurationByResult;
    /**
     * Aggregation of calls duration by company hours (BusinessHours, AfterHours)
     */
    public AggregationResponseOptionsTimersCallsDurationByCompanyHours callsDurationByCompanyHours;
    /**
     * Aggregation of calls duration by queue SLA (InSLA, OutSLA). This timer is only applicable to Queues grouping
     */
    public AggregationResponseOptionsTimersCallsDurationByQueueSla callsDurationByQueueSla;
    /**
     * Aggregation of calls duration by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound, QueueCallPickup)
     */
    public AggregationResponseOptionsTimersCallsDurationByType callsDurationByType;
    /**
     * Aggregation of calls duration by party that ended the call (Callee, Caller, System)
     */
    public AggregationResponseOptionsTimersCallsDurationByEndingParty callsDurationByEndingParty;
    /**
     * Aggregation of calls duration by queue hours (BusinessHours, AfterHours)
     */
    public AggregationResponseOptionsTimersCallsDurationByQueueHours callsDurationByQueueHours;

    public AggregationResponseOptionsTimers allCallsDuration(AggregationResponseOptionsTimersAllCallsDuration allCallsDuration) {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByDirection(AggregationResponseOptionsTimersCallsDurationByDirection callsDurationByDirection) {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByOrigin(AggregationResponseOptionsTimersCallsDurationByOrigin callsDurationByOrigin) {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByResponse(AggregationResponseOptionsTimersCallsDurationByResponse callsDurationByResponse) {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    public AggregationResponseOptionsTimers callsSegmentsDuration(AggregationResponseOptionsTimersCallsSegmentsDuration callsSegmentsDuration) {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByResult(AggregationResponseOptionsTimersCallsDurationByResult callsDurationByResult) {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByCompanyHours(AggregationResponseOptionsTimersCallsDurationByCompanyHours callsDurationByCompanyHours) {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByQueueSla(AggregationResponseOptionsTimersCallsDurationByQueueSla callsDurationByQueueSla) {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByType(AggregationResponseOptionsTimersCallsDurationByType callsDurationByType) {
        this.callsDurationByType = callsDurationByType;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByEndingParty(AggregationResponseOptionsTimersCallsDurationByEndingParty callsDurationByEndingParty) {
        this.callsDurationByEndingParty = callsDurationByEndingParty;
        return this;
    }

    public AggregationResponseOptionsTimers callsDurationByQueueHours(AggregationResponseOptionsTimersCallsDurationByQueueHours callsDurationByQueueHours) {
        this.callsDurationByQueueHours = callsDurationByQueueHours;
        return this;
    }
}
