package com.ringcentral.definitions;


    /**
* The formula is defined by `aggregationType` and `aggregationInterval` for every timer individually. If `aggregationType` is `Sum` or `Percent`, `aggregationInterval` is not supported. If `aggregationType` is `Min`, `Max` or `Average`,`aggregationInterval` is supported, but not required. If left empty, aggregation will be performed on per-call basis
*/
public class PerformanceCallsTimersResponseOptions
{
    /**
     */
    public PerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration;
    public PerformanceCallsTimersResponseOptions allCallsDuration(PerformanceCallsTimersResponseOptionsAllCallsDuration allCallsDuration)
    {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection;
    public PerformanceCallsTimersResponseOptions callsDurationByDirection(PerformanceCallsTimersResponseOptionsCallsDurationByDirection callsDurationByDirection)
    {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin;
    public PerformanceCallsTimersResponseOptions callsDurationByOrigin(PerformanceCallsTimersResponseOptionsCallsDurationByOrigin callsDurationByOrigin)
    {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse;
    public PerformanceCallsTimersResponseOptions callsDurationByResponse(PerformanceCallsTimersResponseOptionsCallsDurationByResponse callsDurationByResponse)
    {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration;
    public PerformanceCallsTimersResponseOptions callsSegmentsDuration(PerformanceCallsTimersResponseOptionsCallsSegmentsDuration callsSegmentsDuration)
    {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult;
    public PerformanceCallsTimersResponseOptions callsDurationByResult(PerformanceCallsTimersResponseOptionsCallsDurationByResult callsDurationByResult)
    {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours;
    public PerformanceCallsTimersResponseOptions callsDurationByCompanyHours(PerformanceCallsTimersResponseOptionsCallsDurationByCompanyHours callsDurationByCompanyHours)
    {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    /**
     * This timer is only applicable to Queues grouping
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla;
    public PerformanceCallsTimersResponseOptions callsDurationByQueueSla(PerformanceCallsTimersResponseOptionsCallsDurationByQueueSla callsDurationByQueueSla)
    {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    /**
     */
    public PerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType;
    public PerformanceCallsTimersResponseOptions callsDurationByType(PerformanceCallsTimersResponseOptionsCallsDurationByType callsDurationByType)
    {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}