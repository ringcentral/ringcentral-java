package com.ringcentral.definitions;


/**
 * Call volume data for the specified grouping
 */
public class AnalyticsLegacyPerformanceCallsCounters {
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
    public AnalyticsLegacyPerformanceCallsActions callsActions;
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

    public AnalyticsLegacyPerformanceCallsCounters allCalls(AnalyticsLegacyPerformanceCallsTotal allCalls) {
        this.allCalls = allCalls;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsByDirection(AnalyticsLegacyPerformanceCallsByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsByOrigin(AnalyticsLegacyPerformanceCallsByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsByResponse(AnalyticsLegacyPerformanceCallsByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsSegments(AnalyticsLegacyPerformanceCallsSegments callsSegments) {
        this.callsSegments = callsSegments;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsByResult(AnalyticsLegacyPerformanceCallsByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsActions(AnalyticsLegacyPerformanceCallsActions callsActions) {
        this.callsActions = callsActions;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsByCompanyHours(AnalyticsLegacyPerformanceCallsByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsByQueueSla(AnalyticsLegacyPerformanceCallsByQueueSla callsByQueueSla) {
        this.callsByQueueSla = callsByQueueSla;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCounters callsByType(AnalyticsLegacyPerformanceCallsByType callsByType) {
        this.callsByType = callsByType;
        return this;
    }
}
