package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineCountersResponseOptions {
    /**
     *
     */
    public Boolean allCalls;
    /**
     *
     */
    public Boolean callsByDirection;
    /**
     *
     */
    public Boolean callsByOrigin;
    /**
     *
     */
    public Boolean callsByResponse;
    /**
     *
     */
    public Boolean callsSegments;
    /**
     *
     */
    public Boolean callsByResult;
    /**
     *
     */
    public Boolean callsByCompanyHours;
    /**
     * This counter is only applicable to Queues grouping
     */
    public Boolean callsByQueueSla;
    /**
     *
     */
    public Boolean callsByActions;
    /**
     *
     */
    public Boolean callsByType;

    public AnalyticsLegacyTimelineCountersResponseOptions allCalls(Boolean allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByDirection(Boolean callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByOrigin(Boolean callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByResponse(Boolean callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsSegments(Boolean callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByResult(Boolean callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByCompanyHours(Boolean callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByQueueSla(Boolean callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByActions(Boolean callsByActions) {
        this.callsByActions = callsByActions;
        return this;
    }

    public AnalyticsLegacyTimelineCountersResponseOptions callsByType(Boolean callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
