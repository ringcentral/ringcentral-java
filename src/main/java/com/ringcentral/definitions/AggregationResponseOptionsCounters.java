package com.ringcentral.definitions;


    /**
* The formula is defined by `aggregationType` and `aggregationInterval` for every counter individually.
* If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
* If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is required
*/
public class AggregationResponseOptionsCounters
{
    /**
     * Aggregation of all calls count
     */
    public AggregationResponseOptionsCountersAllCalls allCalls;
    public AggregationResponseOptionsCounters allCalls(AggregationResponseOptionsCountersAllCalls allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     * Aggregation of calls count by direction (Inbound, Outbound)
     */
    public AggregationResponseOptionsCountersCallsByDirection callsByDirection;
    public AggregationResponseOptionsCounters callsByDirection(AggregationResponseOptionsCountersCallsByDirection callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     * Aggregation of calls count by origin (Internal, External)
     */
    public AggregationResponseOptionsCountersCallsByOrigin callsByOrigin;
    public AggregationResponseOptionsCounters callsByOrigin(AggregationResponseOptionsCountersCallsByOrigin callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     * Aggregation of calls count by response (Answered, NotAnswered, Connected, NotConnected)
     */
    public AggregationResponseOptionsCountersCallsByResponse callsByResponse;
    public AggregationResponseOptionsCounters callsByResponse(AggregationResponseOptionsCountersCallsByResponse callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     * Aggregation of calls count by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
     */
    public AggregationResponseOptionsCountersCallsSegments callsSegments;
    public AggregationResponseOptionsCounters callsSegments(AggregationResponseOptionsCountersCallsSegments callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     * Aggregation of calls count by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted)
     */
    public AggregationResponseOptionsCountersCallsByResult callsByResult;
    public AggregationResponseOptionsCounters callsByResult(AggregationResponseOptionsCountersCallsByResult callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     * Aggregation of calls count by company hours (BusinessHours, AfterHours)
     */
    public AggregationResponseOptionsCountersCallsByCompanyHours callsByCompanyHours;
    public AggregationResponseOptionsCounters callsByCompanyHours(AggregationResponseOptionsCountersCallsByCompanyHours callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     * Aggregation of calls count by queue SLA (InSLA, OutSLA). This counter is only applicable to Queues grouping
     */
    public AggregationResponseOptionsCountersCallsByQueueSla callsByQueueSla;
    public AggregationResponseOptionsCounters callsByQueueSla(AggregationResponseOptionsCountersCallsByQueueSla callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     * Aggregation of calls count by action (HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer)
     */
    public AggregationResponseOptionsCountersCallsByActions callsByActions;
    public AggregationResponseOptionsCounters callsByActions(AggregationResponseOptionsCountersCallsByActions callsByActions)
    {
        this.callsByActions = callsByActions;
        return this;
    }

    /**
     * Aggregation of calls count by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound)
     */
    public AggregationResponseOptionsCountersCallsByType callsByType;
    public AggregationResponseOptionsCounters callsByType(AggregationResponseOptionsCountersCallsByType callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }

    /**
     * Aggregation of calls count by the total number of times a Queue call was presented to the user. It is limited to `groupBy` Users and `groupByMembers` (Department, Queue, Site, UserGroup) grouping. Only the listed below options for call filters are applicable to `queueOpportunities` and provide meaningful results: `queues` (selected queue extension ids), `callResults` (Missed, Abandoned), `callResponses` (Answered, NotAnswered), `origins` (Internal, External)
     */
    public AggregationResponseOptionsCountersQueueOpportunities queueOpportunities;
    public AggregationResponseOptionsCounters queueOpportunities(AggregationResponseOptionsCountersQueueOpportunities queueOpportunities)
    {
        this.queueOpportunities = queueOpportunities;
        return this;
    }
}