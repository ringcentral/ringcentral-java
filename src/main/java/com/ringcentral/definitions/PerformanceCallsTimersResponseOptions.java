package com.ringcentral.definitions;


// Performance calls timers
public class PerformanceCallsTimersResponseOptions {
    /**
     *
     */
    public PerformanceCallsTimer totalCallLength;
    /**
     *
     */
    public PerformanceCallsTimer timeSpentByCallSegments;
    /**
     *
     */
    public PerformanceCallsTimer callLengthByDirection;
    /**
     *
     */
    public PerformanceCallsTimer callLengthByOrigin;
    /**
     *
     */
    public PerformanceCallsTimer callLengthByResponse;
    /**
     *
     */
    public PerformanceCallsTimer callLengthByResponseType;
    /**
     *
     */
    public PerformanceCallsTimer callLengthByResult;
    /**
     *
     */
    public PerformanceCallsTimer callsLengthByCompanyHours;

    public PerformanceCallsTimersResponseOptions totalCallLength(PerformanceCallsTimer totalCallLength) {
        this.totalCallLength = totalCallLength;
        return this;
    }

    public PerformanceCallsTimersResponseOptions timeSpentByCallSegments(PerformanceCallsTimer timeSpentByCallSegments) {
        this.timeSpentByCallSegments = timeSpentByCallSegments;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callLengthByDirection(PerformanceCallsTimer callLengthByDirection) {
        this.callLengthByDirection = callLengthByDirection;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callLengthByOrigin(PerformanceCallsTimer callLengthByOrigin) {
        this.callLengthByOrigin = callLengthByOrigin;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callLengthByResponse(PerformanceCallsTimer callLengthByResponse) {
        this.callLengthByResponse = callLengthByResponse;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callLengthByResponseType(PerformanceCallsTimer callLengthByResponseType) {
        this.callLengthByResponseType = callLengthByResponseType;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callLengthByResult(PerformanceCallsTimer callLengthByResult) {
        this.callLengthByResult = callLengthByResult;
        return this;
    }

    public PerformanceCallsTimersResponseOptions callsLengthByCompanyHours(PerformanceCallsTimer callsLengthByCompanyHours) {
        this.callsLengthByCompanyHours = callsLengthByCompanyHours;
        return this;
    }
}
