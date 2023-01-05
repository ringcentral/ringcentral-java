package com.ringcentral.definitions;


    /**
* The formula is defined by `aggregationType` and `aggregationInterval` for every timer individually.
* If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported.
* If `aggregationType` is `Min`, `Max` or `Average`, `aggregationInterval` is supported, but not required.
* If left empty, aggregation will be performed on per-call basis
*/
public class AnalyticsLegacyPerformanceCallsTimersResponseOptions
{
    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions allCallsDuration(AnalyticsLegacyPerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration)
    {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByDirection(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection)
    {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByOrigin(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin)
    {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByResponse(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse)
    {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsSegmentsDuration(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration)
    {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByResult(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult)
    {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByCompanyHours(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours)
    {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    /**
     * This timer is only applicable to Queues grouping
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByQueueSla(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla)
    {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptions callsDurationByType(AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType)
    {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}