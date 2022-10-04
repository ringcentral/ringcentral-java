package com.ringcentral.definitions;


/**
 * The formula is defined by `aggregationType` and `aggregationInterval` for every timer individually.
 * If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
 * If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is supported, but not required.
 * If left empty, aggregation will be performed on per-call basis
 */
public class AnalyticsLegacyPerformanceCallsTimersResponseOptions {
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours;
    /**
     * This timer is only applicable to Queues grouping
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla;
    /**
     *
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType;

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions allCallsDuration(AnalyticsLegacyPerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration) {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByDirection(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection) {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByOrigin(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin) {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByResponse(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse) {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsSegmentsDuration(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration) {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByResult(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult) {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByCompanyHours(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours) {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByQueueSla(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla) {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByType(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType) {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}
