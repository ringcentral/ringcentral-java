package com.ringcentral.definitions;


public class TimelineTimersResponseOptions {
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

    public TimelineTimersResponseOptions allCallsDuration(Boolean allCallsDuration) {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    public TimelineTimersResponseOptions callsDurationByDirection(Boolean callsDurationByDirection) {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    public TimelineTimersResponseOptions callsDurationByOrigin(Boolean callsDurationByOrigin) {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    public TimelineTimersResponseOptions callsDurationByResponse(Boolean callsDurationByResponse) {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    public TimelineTimersResponseOptions callsSegmentsDuration(Boolean callsSegmentsDuration) {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    public TimelineTimersResponseOptions callsDurationByResult(Boolean callsDurationByResult) {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    public TimelineTimersResponseOptions callsDurationByCompanyHours(Boolean callsDurationByCompanyHours) {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    public TimelineTimersResponseOptions callsDurationByQueueSla(Boolean callsDurationByQueueSla) {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    public TimelineTimersResponseOptions callsDurationByType(Boolean callsDurationByType) {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}
