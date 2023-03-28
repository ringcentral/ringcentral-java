package com.ringcentral.definitions;


/**
 * The formula is defined by `aggregationType` and `aggregationInterval` for every counter individually.
 * If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
 * If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is required
 */
public class AnalyticsLegacyPerformanceCallsCountersResponseOptions {
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsAllCalls allCalls;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsSegments callsSegments;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResult callsByResult;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours;
    /**
     * This counter is only applicable to Queues grouping
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByActions callsByActions;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByType callsByType;

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions allCalls(AnalyticsLegacyPerformanceCallsCountersResponseOptionsAllCalls allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByDirection(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByOrigin(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByResponse(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsSegments(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsSegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByResult(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByCompanyHours(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByQueueSla(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByActions(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByActions callsByActions) {
        this.callsByActions = callsByActions;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCountersResponseOptions callsByType(AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
