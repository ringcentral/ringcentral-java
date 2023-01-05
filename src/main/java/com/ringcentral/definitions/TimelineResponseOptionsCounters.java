package com.ringcentral.definitions;


    /**
* Options for selecting breakdown for calls count
*/
public class TimelineResponseOptionsCounters
{
    /**
     * Include data for total calls count
     */
    public Boolean allCalls;
    public TimelineResponseOptionsCounters allCalls(Boolean allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     * Include breakdown of calls count by direction (Inbound, Outbound)
     */
    public Boolean callsByDirection;
    public TimelineResponseOptionsCounters callsByDirection(Boolean callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     * Include breakdown of calls count by origin (Internal, External)
     */
    public Boolean callsByOrigin;
    public TimelineResponseOptionsCounters callsByOrigin(Boolean callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     * Include breakdown of calls count by response (Answered, NotAnswered, Connected, NotConnected)
     */
    public Boolean callsByResponse;
    public TimelineResponseOptionsCounters callsByResponse(Boolean callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     * Include breakdown of calls count by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
     */
    public Boolean callsSegments;
    public TimelineResponseOptionsCounters callsSegments(Boolean callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     * Include breakdown of calls count by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted)
     */
    public Boolean callsByResult;
    public TimelineResponseOptionsCounters callsByResult(Boolean callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     * Include breakdown of calls count by company hours (BusinessHours, AfterHours)
     */
    public Boolean callsByCompanyHours;
    public TimelineResponseOptionsCounters callsByCompanyHours(Boolean callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     * Include breakdown of calls count by queue SLA (InSLA, OutSLA). This counter is only applicable to Queues grouping
     */
    public Boolean callsByQueueSla;
    public TimelineResponseOptionsCounters callsByQueueSla(Boolean callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     * Include breakdown of calls count by action (HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer)
     */
    public Boolean callsByActions;
    public TimelineResponseOptionsCounters callsByActions(Boolean callsByActions)
    {
        this.callsByActions = callsByActions;
        return this;
    }

    /**
     * Include breakdown of calls count by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound)
     */
    public Boolean callsByType;
    public TimelineResponseOptionsCounters callsByType(Boolean callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }

    /**
     * Include breakdown of calls count by the total number of times a Queue call was presented to the user. It is limited to `groupBy` Users and `groupByMembers` (Department, Queue, Site, UserGroup) grouping. Only the listed below options for call filters are applicable to `queueOpportunities` and provide meaningful results: `queues` (selected queue extension ids), `callResults` (Missed, Abandoned), `callResponses` (Answered, NotAnswered), `origins` (Internal, External)
     */
    public Boolean queueOpportunities;
    public TimelineResponseOptionsCounters queueOpportunities(Boolean queueOpportunities)
    {
        this.queueOpportunities = queueOpportunities;
        return this;
    }
}