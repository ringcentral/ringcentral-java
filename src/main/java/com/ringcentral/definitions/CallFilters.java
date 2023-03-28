package com.ringcentral.definitions;


/**
 * Optional filters that limit the scope of calls (joined via AND)
 */
public class CallFilters {
    /**
     *
     */
    public ExtensionFilters extensionFilters;
    /**
     * List of queues extension ids which allows to get data only for calls that were routed through any of these queues
     */
    public String[] queues;
    /**
     * The direct company numbers the caller called (joined via OR)
     */
    public String[] calledNumbers;
    /**
     * Specifies the call directions relative to the scope specified in grouping object (joined via OR). Not applicable to internal origin calls with company scope
     * Enum: Inbound, Outbound
     */
    public String[] directions;
    /**
     * Specifies whether an external party was present in the initial segment of the call (joined via OR)
     * Enum: Internal, External
     */
    public String[] origins;
    /**
     * Filtering of calls by first response (joined via OR)
     * Enum: Answered, NotAnswered, Connected, NotConnected
     */
    public String[] callResponses;
    /**
     * Filtering of calls by the nature of call result (joined via OR)
     * Enum: Completed, Abandoned, Voicemail, Unknown, Missed, Accepted
     */
    public String[] callResults;
    /**
     * Filtering of calls by presence of specific segment (joined via OR)
     */
    public CallSegmentFilter[] callSegments;
    /**
     * Filtering of calls by presence of specific action (joined via OR)
     * Enum: HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer
     */
    public String[] callActions;
    /**
     * Filtering of calls by company&#039;s business hours or after hours (joined via OR)
     * Enum: BusinessHours, AfterHours
     */
    public String[] companyHours;
    /**
     *
     */
    public CallDurationFilter callDuration;
    /**
     *
     */
    public TimeSpentFilter timeSpent;
    /**
     * Filtering calls that were within or out of queue SLA (joined via OR). Only applicable to Queues grouping
     * Enum: InSla, OutSla
     */
    public String[] queueSla;
    /**
     * Filtering of calls based on how the call started from the callee perspective (joined via OR). If the call is outbound relative to the grouping scope, CallType is Outbound
     * Enum: Direct, FromQueue, ParkRetrieval, Transferred, Outbound, Overflow
     */
    public String[] callTypes;

    public CallFilters extensionFilters(ExtensionFilters extensionFilters) {
        this.extensionFilters = extensionFilters;
        return this;
    }

    public CallFilters queues(String[] queues) {
        this.queues = queues;
        return this;
    }

    public CallFilters calledNumbers(String[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public CallFilters directions(String[] directions) {
        this.directions = directions;
        return this;
    }

    public CallFilters origins(String[] origins) {
        this.origins = origins;
        return this;
    }

    public CallFilters callResponses(String[] callResponses) {
        this.callResponses = callResponses;
        return this;
    }

    public CallFilters callResults(String[] callResults) {
        this.callResults = callResults;
        return this;
    }

    public CallFilters callSegments(CallSegmentFilter[] callSegments) {
        this.callSegments = callSegments;
        return this;
    }

    public CallFilters callActions(String[] callActions) {
        this.callActions = callActions;
        return this;
    }

    public CallFilters companyHours(String[] companyHours) {
        this.companyHours = companyHours;
        return this;
    }

    public CallFilters callDuration(CallDurationFilter callDuration) {
        this.callDuration = callDuration;
        return this;
    }

    public CallFilters timeSpent(TimeSpentFilter timeSpent) {
        this.timeSpent = timeSpent;
        return this;
    }

    public CallFilters queueSla(String[] queueSla) {
        this.queueSla = queueSla;
        return this;
    }

    public CallFilters callTypes(String[] callTypes) {
        this.callTypes = callTypes;
        return this;
    }
}
