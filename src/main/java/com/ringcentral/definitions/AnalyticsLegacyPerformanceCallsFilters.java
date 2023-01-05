package com.ringcentral.definitions;


    /**
* Optional filters that limit the scope of calls to be aggregated (joined via AND)
*/
public class AnalyticsLegacyPerformanceCallsFilters
{
    /**
     * Specifies whether the call was inbound or outbound relative to the scope specified in grouping object. Not applicable to internal calls with company scope (when grouping is not specified)
     * Enum: Inbound, Outbound
     */
    public String direction;
    public AnalyticsLegacyPerformanceCallsFilters direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * Specifies whether an external party was present in the initial segment of the call
     * Enum: Internal, External
     */
    public String origin;
    public AnalyticsLegacyPerformanceCallsFilters origin(String origin)
    {
        this.origin = origin;
        return this;
    }

    /**
     * Aggregation of calls by first response
     * Enum: Answered, NotAnswered, Connected, NotConnected
     */
    public String callResponse;
    public AnalyticsLegacyPerformanceCallsFilters callResponse(String callResponse)
    {
        this.callResponse = callResponse;
        return this;
    }

    /**
     * Aggregation of calls by the nature of call result (joined via OR)
     * Enum: Completed, Abandoned, Voicemail, Unknown, Missed, Accepted
     */
    public String[] callResult;
    public AnalyticsLegacyPerformanceCallsFilters callResult(String[] callResult)
    {
        this.callResult = callResult;
        return this;
    }

    /**
     * Aggregation of calls by presence of specific segment (joined via OR)
     */
    public AnalyticsLegacyCallSegmentFilter[] callSegments;
    public AnalyticsLegacyPerformanceCallsFilters callSegments(AnalyticsLegacyCallSegmentFilter[] callSegments)
    {
        this.callSegments = callSegments;
        return this;
    }

    /**
     * Aggregation of calls by presence of specific action (joined via OR)
     */
    public AnalyticsLegacyCallActionFilter[] callActions;
    public AnalyticsLegacyPerformanceCallsFilters callActions(AnalyticsLegacyCallActionFilter[] callActions)
    {
        this.callActions = callActions;
        return this;
    }

    /**
     * Aggregation of calls by company&#039;s business hours or after hours
     * Enum: BusinessHours, AfterHours
     */
    public String companyHours;
    public AnalyticsLegacyPerformanceCallsFilters companyHours(String companyHours)
    {
        this.companyHours = companyHours;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsFilterByLength callDuration;
    public AnalyticsLegacyPerformanceCallsFilters callDuration(AnalyticsLegacyPerformanceCallsFilterByLength callDuration)
    {
        this.callDuration = callDuration;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsFilterTimeSpentByMailbox timeSpent;
    public AnalyticsLegacyPerformanceCallsFilters timeSpent(AnalyticsLegacyPerformanceCallsFilterTimeSpentByMailbox timeSpent)
    {
        this.timeSpent = timeSpent;
        return this;
    }

    /**
     * List of extension Ids from which users specified in groupBy received calls, items are joined via OR condition
     */
    public String[] callerExtensionIds;
    public AnalyticsLegacyPerformanceCallsFilters callerExtensionIds(String[] callerExtensionIds)
    {
        this.callerExtensionIds = callerExtensionIds;
        return this;
    }

    /**
     * List of extension Ids to which users specified in groupBy placed calls, items are joined via OR condition
     */
    public String[] calledExtensionIds;
    public AnalyticsLegacyPerformanceCallsFilters calledExtensionIds(String[] calledExtensionIds)
    {
        this.calledExtensionIds = calledExtensionIds;
        return this;
    }

    /**
     * The direct company numbers the caller called (joined via OR)
     */
    public String[] calledNumbers;
    public AnalyticsLegacyPerformanceCallsFilters calledNumbers(String[] calledNumbers)
    {
        this.calledNumbers = calledNumbers;
        return this;
    }

    /**
     * This filter allows to get aggregation of calls that were either within or out of queue SLA. Only applicable to Queues grouping
     * Enum: InSla, OutSla
     */
    public String queueSla;
    public AnalyticsLegacyPerformanceCallsFilters queueSla(String queueSla)
    {
        this.queueSla = queueSla;
        return this;
    }

    /**
     * This filter allows to get aggregation of calls based on how the call started from the callee perspective (joined via OR). If the call is outbound relative to the grouping scope, callType is Outbound
     * Enum: Direct, FromQueue, ParkRetrieval, Transferred, Outbound
     */
    public String[] callType;
    public AnalyticsLegacyPerformanceCallsFilters callType(String[] callType)
    {
        this.callType = callType;
        return this;
    }
}