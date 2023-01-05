package com.ringcentral.definitions;


    /**
* Optional filters that limit the scope of calls (joined via AND)
*/
public class CallFilters
{
    /**
     */
    public ExtensionFilters extensionFilters;
    public CallFilters extensionFilters(ExtensionFilters extensionFilters)
    {
        this.extensionFilters = extensionFilters;
        return this;
    }

    /**
     * List of queues extension ids which allows to get data only for calls that were routed through any of these queues
     */
    public String[] queues;
    public CallFilters queues(String[] queues)
    {
        this.queues = queues;
        return this;
    }

    /**
     * The direct company numbers the caller called (joined via OR)
     */
    public String[] calledNumbers;
    public CallFilters calledNumbers(String[] calledNumbers)
    {
        this.calledNumbers = calledNumbers;
        return this;
    }

    /**
     * Specifies the call directions relative to the scope specified in grouping object (joined via OR). Not applicable to internal origin calls with company scope
     * Enum: Inbound, Outbound
     */
    public String[] directions;
    public CallFilters directions(String[] directions)
    {
        this.directions = directions;
        return this;
    }

    /**
     * Specifies whether an external party was present in the initial segment of the call (joined via OR)
     * Enum: Internal, External
     */
    public String[] origins;
    public CallFilters origins(String[] origins)
    {
        this.origins = origins;
        return this;
    }

    /**
     * Filtering of calls by first response (joined via OR)
     * Enum: Answered, NotAnswered, Connected, NotConnected
     */
    public String[] callResponses;
    public CallFilters callResponses(String[] callResponses)
    {
        this.callResponses = callResponses;
        return this;
    }

    /**
     * Filtering of calls by the nature of call result (joined via OR)
     * Enum: Completed, Abandoned, Voicemail, Unknown, Missed, Accepted
     */
    public String[] callResults;
    public CallFilters callResults(String[] callResults)
    {
        this.callResults = callResults;
        return this;
    }

    /**
     * Filtering of calls by presence of specific segment (joined via OR)
     */
    public CallSegmentFilter[] callSegments;
    public CallFilters callSegments(CallSegmentFilter[] callSegments)
    {
        this.callSegments = callSegments;
        return this;
    }

    /**
     * Filtering of calls by presence of specific action (joined via OR)
     * Enum: HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer
     */
    public String[] callActions;
    public CallFilters callActions(String[] callActions)
    {
        this.callActions = callActions;
        return this;
    }

    /**
     * Filtering of calls by company&#039;s business hours or after hours (joined via OR)
     * Enum: BusinessHours, AfterHours
     */
    public String[] companyHours;
    public CallFilters companyHours(String[] companyHours)
    {
        this.companyHours = companyHours;
        return this;
    }

    /**
     */
    public CallDurationFilter callDuration;
    public CallFilters callDuration(CallDurationFilter callDuration)
    {
        this.callDuration = callDuration;
        return this;
    }

    /**
     */
    public TimeSpentFilter timeSpent;
    public CallFilters timeSpent(TimeSpentFilter timeSpent)
    {
        this.timeSpent = timeSpent;
        return this;
    }

    /**
     * Filtering calls that were within or out of queue SLA (joined via OR). Only applicable to Queues grouping
     * Enum: InSla, OutSla
     */
    public String[] queueSla;
    public CallFilters queueSla(String[] queueSla)
    {
        this.queueSla = queueSla;
        return this;
    }

    /**
     * Filtering of calls based on how the call started from the callee perspective (joined via OR). If the call is outbound relative to the grouping scope, CallType is Outbound
     * Enum: Direct, FromQueue, ParkRetrieval, Transferred, Outbound, Overflow
     */
    public String[] callTypes;
    public CallFilters callTypes(String[] callTypes)
    {
        this.callTypes = callTypes;
        return this;
    }
}