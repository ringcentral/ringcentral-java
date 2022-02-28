package com.ringcentral.definitions;


/**
 * Optional filters that limit the scope of calls to be aggregated (joined via AND)
 */
public class PerformanceCallsFilters {
    /**
     * Specifies whether the call was inbound or outbound relative to the scope specified in grouping object. Not applicable to internal calls with company scope (when grouping is not specified)
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Specifies whether an external party was present in the initial segment of the call
     * Enum: Internal, External
     */
    public String origin;
    /**
     * Aggregation of calls by first response
     * Enum: Answered, NotAnswered, Connected, NotConnected
     */
    public String callResponse;
    /**
     * Aggregation of calls by the nature of call result (joined via OR)
     * Enum: Completed, Abandoned, Voicemail, Unknown, Missed, Accepted
     */
    public String[] callResult;
    /**
     * Aggregation of calls by presence of specific segment (joined via OR)
     */
    public CallSegmentFilter[] callSegments;
    /**
     * Aggregation of calls by presence of specific action (joined via OR)
     */
    public CallActionFilter[] callActions;
    /**
     * Aggregation of calls by company&#039;s business hours or after hours
     * Enum: BusinessHours, AfterHours
     */
    public String companyHours;
    /**
     *
     */
    public PerformanceCallsFilterByLength callDuration;
    /**
     *
     */
    public PerformanceCallsFilterTimeSpentByMailbox timeSpent;
    /**
     * List of extension Ids from which users specified in groupBy received calls, items are joined via OR condition
     */
    public String[] callerExtensionIds;
    /**
     * List of extension Ids to which users specified in groupBy placed calls, items are joined via OR condition
     */
    public String[] calledExtensionIds;
    /**
     * The direct company numbers the caller called (joined via OR)
     */
    public String[] calledNumbers;
    /**
     * This filter allows to get aggregation of calls that were either within or out of queue SLA. Only applicable to Queues grouping
     * Enum: InSla, OutSla
     */
    public String queueSla;
    /**
     * This filter allows to get aggregation of calls based on how the call started from the callee perspective (joined via OR). If the call is outbound relative to the grouping scope, callType is Outbound
     * Enum: Direct, FromQueue, ParkRetrieval, Transferred, Outbound
     */
    public String[] callType;

    public PerformanceCallsFilters direction(String direction) {
        this.direction = direction;
        return this;
    }

    public PerformanceCallsFilters origin(String origin) {
        this.origin = origin;
        return this;
    }

    public PerformanceCallsFilters callResponse(String callResponse) {
        this.callResponse = callResponse;
        return this;
    }

    public PerformanceCallsFilters callResult(String[] callResult) {
        this.callResult = callResult;
        return this;
    }

    public PerformanceCallsFilters callSegments(CallSegmentFilter[] callSegments) {
        this.callSegments = callSegments;
        return this;
    }

    public PerformanceCallsFilters callActions(CallActionFilter[] callActions) {
        this.callActions = callActions;
        return this;
    }

    public PerformanceCallsFilters companyHours(String companyHours) {
        this.companyHours = companyHours;
        return this;
    }

    public PerformanceCallsFilters callDuration(PerformanceCallsFilterByLength callDuration) {
        this.callDuration = callDuration;
        return this;
    }

    public PerformanceCallsFilters timeSpent(PerformanceCallsFilterTimeSpentByMailbox timeSpent) {
        this.timeSpent = timeSpent;
        return this;
    }

    public PerformanceCallsFilters callerExtensionIds(String[] callerExtensionIds) {
        this.callerExtensionIds = callerExtensionIds;
        return this;
    }

    public PerformanceCallsFilters calledExtensionIds(String[] calledExtensionIds) {
        this.calledExtensionIds = calledExtensionIds;
        return this;
    }

    public PerformanceCallsFilters calledNumbers(String[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public PerformanceCallsFilters queueSla(String queueSla) {
        this.queueSla = queueSla;
        return this;
    }

    public PerformanceCallsFilters callType(String[] callType) {
        this.callType = callType;
        return this;
    }
}
