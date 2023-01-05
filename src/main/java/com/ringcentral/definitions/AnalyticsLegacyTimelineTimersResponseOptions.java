package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineTimersResponseOptions
{
    /**
     */
    public Boolean allCallsDuration;
    public AnalyticsLegacyTimelineTimersResponseOptions allCallsDuration(Boolean allCallsDuration)
    {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    /**
     */
    public Boolean callsDurationByDirection;
    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByDirection(Boolean callsDurationByDirection)
    {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    /**
     */
    public Boolean callsDurationByOrigin;
    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByOrigin(Boolean callsDurationByOrigin)
    {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    /**
     */
    public Boolean callsDurationByResponse;
    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByResponse(Boolean callsDurationByResponse)
    {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    /**
     */
    public Boolean callsSegmentsDuration;
    public AnalyticsLegacyTimelineTimersResponseOptions callsSegmentsDuration(Boolean callsSegmentsDuration)
    {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    /**
     */
    public Boolean callsDurationByResult;
    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByResult(Boolean callsDurationByResult)
    {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    /**
     */
    public Boolean callsDurationByCompanyHours;
    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByCompanyHours(Boolean callsDurationByCompanyHours)
    {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    /**
     * This timer is only applicable to Queues grouping
     */
    public Boolean callsDurationByQueueSla;
    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByQueueSla(Boolean callsDurationByQueueSla)
    {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    /**
     */
    public Boolean callsDurationByType;
    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByType(Boolean callsDurationByType)
    {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}