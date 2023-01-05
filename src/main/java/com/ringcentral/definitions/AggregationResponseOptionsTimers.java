package com.ringcentral.definitions;


    /**
* The formula is defined by `aggregationType` and `aggregationInterval` for every timer individually.
* If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
* If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is supported, but not required.
* If left empty, aggregation will be performed on per-call basis
*/
public class AggregationResponseOptionsTimers
{
    /**
     * Aggregation of all calls duration
     */
    public AggregationResponseOptionsTimersAllCallsDuration allCallsDuration;
    public AggregationResponseOptionsTimers allCallsDuration(AggregationResponseOptionsTimersAllCallsDuration allCallsDuration)
    {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    /**
     * Aggregation of calls duration by direction (Inbound, Outbound)
     */
    public AggregationResponseOptionsTimersCallsDurationByDirection callsDurationByDirection;
    public AggregationResponseOptionsTimers callsDurationByDirection(AggregationResponseOptionsTimersCallsDurationByDirection callsDurationByDirection)
    {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    /**
     * Aggregation of calls duration by origin (Internal, External)
     */
    public AggregationResponseOptionsTimersCallsDurationByOrigin callsDurationByOrigin;
    public AggregationResponseOptionsTimers callsDurationByOrigin(AggregationResponseOptionsTimersCallsDurationByOrigin callsDurationByOrigin)
    {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    /**
     * Aggregation of calls duration by response (Answered, NotAnswered, Connected, NotConnected)
     */
    public AggregationResponseOptionsTimersCallsDurationByResponse callsDurationByResponse;
    public AggregationResponseOptionsTimers callsDurationByResponse(AggregationResponseOptionsTimersCallsDurationByResponse callsDurationByResponse)
    {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    /**
     * Aggregation of calls duration by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
     */
    public AggregationResponseOptionsTimersCallsSegmentsDuration callsSegmentsDuration;
    public AggregationResponseOptionsTimers callsSegmentsDuration(AggregationResponseOptionsTimersCallsSegmentsDuration callsSegmentsDuration)
    {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    /**
     * Aggregation of calls duration by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted)
     */
    public AggregationResponseOptionsTimersCallsDurationByResult callsDurationByResult;
    public AggregationResponseOptionsTimers callsDurationByResult(AggregationResponseOptionsTimersCallsDurationByResult callsDurationByResult)
    {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    /**
     * Aggregation of calls duration by company hours (BusinessHours, AfterHours)
     */
    public AggregationResponseOptionsTimersCallsDurationByCompanyHours callsDurationByCompanyHours;
    public AggregationResponseOptionsTimers callsDurationByCompanyHours(AggregationResponseOptionsTimersCallsDurationByCompanyHours callsDurationByCompanyHours)
    {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    /**
     * Aggregation of calls duration by queue SLA (InSLA, OutSLA). This timer is only applicable to Queues grouping
     */
    public AggregationResponseOptionsTimersCallsDurationByQueueSla callsDurationByQueueSla;
    public AggregationResponseOptionsTimers callsDurationByQueueSla(AggregationResponseOptionsTimersCallsDurationByQueueSla callsDurationByQueueSla)
    {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    /**
     * Aggregation of calls duration by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound)
     */
    public AggregationResponseOptionsTimersCallsDurationByType callsDurationByType;
    public AggregationResponseOptionsTimers callsDurationByType(AggregationResponseOptionsTimersCallsDurationByType callsDurationByType)
    {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}