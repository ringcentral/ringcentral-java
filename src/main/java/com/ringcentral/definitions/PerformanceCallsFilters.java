package com.ringcentral.definitions;


// Optional filters that limit the scope of calls to be aggregated. Multiple values can be joined via 'AND'
public class PerformanceCallsFilters {
    /**
     * Specifies whether a call is inbound or outbound relative to the account. Not applicable to internal calls
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Specifies whether a call was originated within the account or outside of it
     * Enum: Internal, External
     */
    public String origin;
    /**
     * Aggregation of calls by the first response
     * Enum: Answered, NotAnswered
     */
    public String callResponse;
    /**
     * List of call response types. Multiple values can be joined via &#039;OR&#039;
     * Enum: InboundDirect, ParkRetrievals, QueueCalls, Transferred, Missed, Accepted
     */
    public String[] callResponseType;
    /**
     * Aggregation of calls by the nature of call result. Multiple values can be joined via &#039;OR&#039;
     * Enum: Completed, Abandoned, VoiceMail, Connected
     */
    public String[] callResult;
    /**
     * Aggregation of calls by presence of specific segment. Multiple values can be joined via &#039;OR&#039;
     */
    public CallSegmentFilter[] callSegments;
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

    public PerformanceCallsFilters callResponseType(String[] callResponseType) {
        this.callResponseType = callResponseType;
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
}
