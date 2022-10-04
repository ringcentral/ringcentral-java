package com.ringcentral.definitions;


/**
 * Call length data for the specified grouping
 */
public class AnalyticsLegacyPerformanceCallsTimers {
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTotal allCalls;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsByDirection callsByDirection;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsByOrigin callsByOrigin;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsByResponse callsByResponse;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsSegments callsSegments;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsByResult callsByResult;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsByCompanyHours callsByCompanyHours;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsByQueueSla callsByQueueSla;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsByType callsByType;

    public AnalyticsLegacyPerformanceCallsTimers allCalls(AnalyticsLegacyPerformanceCallsTotal allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsByDirection(AnalyticsLegacyPerformanceCallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsByOrigin(AnalyticsLegacyPerformanceCallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsByResponse(AnalyticsLegacyPerformanceCallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsSegments(AnalyticsLegacyPerformanceCallsSegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsByResult(AnalyticsLegacyPerformanceCallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsByCompanyHours(AnalyticsLegacyPerformanceCallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsByQueueSla(AnalyticsLegacyPerformanceCallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimers callsByType(AnalyticsLegacyPerformanceCallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
