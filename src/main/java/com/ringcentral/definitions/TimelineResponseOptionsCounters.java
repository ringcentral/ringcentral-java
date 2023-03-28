package com.ringcentral.definitions;


/**
 * Options for selecting breakdown for calls count
 */
public class TimelineResponseOptionsCounters {
    /**
     * Include data for total calls count
     */
    public Boolean allCalls;
    /**
     * Include breakdown of calls count by direction (Inbound, Outbound)
     */
    public Boolean callsByDirection;
    /**
     * Include breakdown of calls count by origin (Internal, External)
     */
    public Boolean callsByOrigin;
    /**
     * Include breakdown of calls count by response (Answered, NotAnswered, Connected, NotConnected)
     */
    public Boolean callsByResponse;
    /**
     * Include breakdown of calls count by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
     */
    public Boolean callsSegments;
    /**
     * Include breakdown of calls count by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted)
     */
    public Boolean callsByResult;
    /**
     * Include breakdown of calls count by company hours (BusinessHours, AfterHours)
     */
    public Boolean callsByCompanyHours;
    /**
     * Include breakdown of calls count by queue SLA (InSLA, OutSLA). This counter is only applicable to Queues grouping
     */
    public Boolean callsByQueueSla;
    /**
     * Include breakdown of calls count by action (HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer)
     */
    public Boolean callsByActions;
    /**
     * Include breakdown of calls count by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound)
     */
    public Boolean callsByType;
    /**
     * Include breakdown of calls count by the total number of times a Queue call was presented to the user. It is limited to `groupBy` Users and `groupByMembers` (Department, Queue, Site, UserGroup) grouping. Only the listed below options for call filters are applicable to `queueOpportunities` and provide meaningful results: `queues` (selected queue extension ids), `callResults` (Missed, Abandoned), `callResponses` (Answered, NotAnswered), `origins` (Internal, External)
     */
    public Boolean queueOpportunities;

    public TimelineResponseOptionsCounters allCalls(Boolean allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public TimelineResponseOptionsCounters callsByDirection(Boolean callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public TimelineResponseOptionsCounters callsByOrigin(Boolean callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public TimelineResponseOptionsCounters callsByResponse(Boolean callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public TimelineResponseOptionsCounters callsSegments(Boolean callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public TimelineResponseOptionsCounters callsByResult(Boolean callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public TimelineResponseOptionsCounters callsByCompanyHours(Boolean callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public TimelineResponseOptionsCounters callsByQueueSla(Boolean callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public TimelineResponseOptionsCounters callsByActions(Boolean callsByActions) {
        this.callsByActions = callsByActions;
        return this;
    }

    public TimelineResponseOptionsCounters callsByType(Boolean callsByType) {
        this.callsByType = callsByType;
        return this;
    }

    public TimelineResponseOptionsCounters queueOpportunities(Boolean queueOpportunities) {
        this.queueOpportunities = queueOpportunities;
        return this;
    }
}
