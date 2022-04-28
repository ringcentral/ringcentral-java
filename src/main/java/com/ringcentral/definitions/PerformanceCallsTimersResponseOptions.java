package com.ringcentral.definitions;


/**
 * The formula is defined by `aggregationType` and `aggregationInterval` for every timer individually.
 * If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
 * If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is supported, but not required.
 * If left empty, aggregation will be performed on per-call basis
 */
public class PerformanceCallsTimersResponseOptions {
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours;
    /**
     * This timer is only applicable to Queues grouping
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla;
    /**
     *
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType;

    public PerformanceCallsTimersResponseOptions allCallsDuration(PerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration) {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByDirection(PerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection) {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByOrigin(PerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin) {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByResponse(PerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse) {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsSegmentsDuration(PerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration) {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByResult(PerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult) {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByCompanyHours(PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours) {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByQueueSla(PerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla) {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsDurationByType(PerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType) {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}
