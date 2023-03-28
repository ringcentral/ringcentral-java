package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineTimersResponseOptions {
    /**
     *
     */
    public Boolean allCallsDuration;
    /**
     *
     */
    public Boolean callsDurationByDirection;
    /**
     *
     */
    public Boolean callsDurationByOrigin;
    /**
     *
     */
    public Boolean callsDurationByResponse;
    /**
     *
     */
    public Boolean callsSegmentsDuration;
    /**
     *
     */
    public Boolean callsDurationByResult;
    /**
     *
     */
    public Boolean callsDurationByCompanyHours;
    /**
     * This timer is only applicable to Queues grouping
     */
    public Boolean callsDurationByQueueSla;
    /**
     *
     */
    public Boolean callsDurationByType;

    public AnalyticsLegacyTimelineTimersResponseOptions allCallsDuration(Boolean allCallsDuration) {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByDirection(Boolean callsDurationByDirection) {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByOrigin(Boolean callsDurationByOrigin) {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByResponse(Boolean callsDurationByResponse) {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsSegmentsDuration(Boolean callsSegmentsDuration) {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByResult(Boolean callsDurationByResult) {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByCompanyHours(Boolean callsDurationByCompanyHours) {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByQueueSla(Boolean callsDurationByQueueSla) {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    public AnalyticsLegacyTimelineTimersResponseOptions callsDurationByType(Boolean callsDurationByType) {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}
