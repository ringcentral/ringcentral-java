package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineCountersResponseOptions
{
    /**
     */
    public Boolean allCalls;
    public AnalyticsLegacyTimelineCountersResponseOptions allCalls(Boolean allCalls)
    {
        this.allCalls = allCalls;
        return this;
    }

    /**
     */
    public Boolean callsByDirection;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByDirection(Boolean callsByDirection)
    {
        this.callsByDirection = callsByDirection;
        return this;
    }

    /**
     */
    public Boolean callsByOrigin;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByOrigin(Boolean callsByOrigin)
    {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    /**
     */
    public Boolean callsByResponse;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByResponse(Boolean callsByResponse)
    {
        this.callsByResponse = callsByResponse;
        return this;
    }

    /**
     */
    public Boolean callsSegments;
    public AnalyticsLegacyTimelineCountersResponseOptions callsSegments(Boolean callsSegments)
    {
        this.callsSegments = callsSegments;
        return this;
    }

    /**
     */
    public Boolean callsByResult;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByResult(Boolean callsByResult)
    {
        this.callsByResult = callsByResult;
        return this;
    }

    /**
     */
    public Boolean callsByCompanyHours;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByCompanyHours(Boolean callsByCompanyHours)
    {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    /**
     * This counter is only applicable to Queues grouping
     */
    public Boolean callsByQueueSla;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByQueueSla(Boolean callsByQueueSla)
    {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    /**
     */
    public Boolean callsByActions;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByActions(Boolean callsByActions)
    {
        this.callsByActions = callsByActions;
        return this;
    }

    /**
     */
    public Boolean callsByType;
    public AnalyticsLegacyTimelineCountersResponseOptions callsByType(Boolean callsByType)
    {
        this.callsByType = callsByType;
        return this;
    }
}