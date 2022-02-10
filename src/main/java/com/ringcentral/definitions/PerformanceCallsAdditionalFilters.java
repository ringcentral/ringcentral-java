package com.ringcentral.definitions;


/**
 * Optional filters that limit the scope of calls to be aggregated. Multiple values can be joined via 'AND'
 */
public class PerformanceCallsAdditionalFilters {
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
     * Aggregation of calls by the first response
     * Enum: Answered, NotAnswered, Connected, NotConnected
     */
    public String callResponse;
    /**
     * List of call response types. This filter allows to get aggregation of calls based on how the call started from the callee perspective. Multiple values can be joined via &#039;OR&#039;. If the call is outbound relative to the grouping scope, `callType` is Outbound
     * Enum: Direct, Outbound, ParkRetrieval, FromQueue, Transferred
     */
    public String[] callType;
    /**
     * Aggregation of calls by the nature of call result. Multiple values can be joined via &#039;OR&#039;
     * Enum: Completed, Abandoned, VoiceMail, Unknown, Missed, Accepted
     */
    public String[] callResult;
    /**
     * Aggregation of calls by presence of specific segment. Multiple values can be joined via &#039;OR&#039;
     */
    public CallSegmentFilter[] callSegments;
    /**
     * Aggregation of calls by presence of specific action (joined via OR)
     */
    public CallPerformanceActionInfo[] callActions;
    /**
     * Aggregation of calls by company business hours or after hours.
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
     * List of extension identifiers from which the users specified in &#039;groupBy&#039; received calls. Multiple values can be joined via &#039;OR&#039;
     */
    public String[] callerExtensionIds;
    /**
     * List of extension identifiers to which the users specified in &#039;groupBy&#039; placed calls. Multiple values can be joined via &#039;OR&#039;
     */
    public String[] calledExtensionIds;
    /**
     * Direct numbers the caller dialed. Multiple values can be joined via &#039;OR&#039;
     */
    public String[] calledNumbers;
    /**
     * This filter allows to get aggregation of calls that were either within or out of queue SLA. Only applicable to Queues grouping
     * Enum: InSla, OutSla
     */
    public String queueSla;

    public PerformanceCallsAdditionalFilters direction(String direction) {
        this.direction = direction;
        return this;
    }

    public PerformanceCallsAdditionalFilters origin(String origin) {
        this.origin = origin;
        return this;
    }

    public PerformanceCallsAdditionalFilters callResponse(String callResponse) {
        this.callResponse = callResponse;
        return this;
    }

    public PerformanceCallsAdditionalFilters callType(String[] callType) {
        this.callType = callType;
        return this;
    }

    public PerformanceCallsAdditionalFilters callResult(String[] callResult) {
        this.callResult = callResult;
        return this;
    }

    public PerformanceCallsAdditionalFilters callSegments(CallSegmentFilter[] callSegments) {
        this.callSegments = callSegments;
        return this;
    }

    public PerformanceCallsAdditionalFilters callActions(CallPerformanceActionInfo[] callActions) {
        this.callActions = callActions;
        return this;
    }

    public PerformanceCallsAdditionalFilters companyHours(String companyHours) {
        this.companyHours = companyHours;
        return this;
    }

    public PerformanceCallsAdditionalFilters callDuration(PerformanceCallsFilterByLength callDuration) {
        this.callDuration = callDuration;
        return this;
    }

    public PerformanceCallsAdditionalFilters timeSpent(PerformanceCallsFilterTimeSpentByMailbox timeSpent) {
        this.timeSpent = timeSpent;
        return this;
    }

    public PerformanceCallsAdditionalFilters callerExtensionIds(String[] callerExtensionIds) {
        this.callerExtensionIds = callerExtensionIds;
        return this;
    }

    public PerformanceCallsAdditionalFilters calledExtensionIds(String[] calledExtensionIds) {
        this.calledExtensionIds = calledExtensionIds;
        return this;
    }

    public PerformanceCallsAdditionalFilters calledNumbers(String[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public PerformanceCallsAdditionalFilters queueSla(String queueSla) {
        this.queueSla = queueSla;
        return this;
    }
}
