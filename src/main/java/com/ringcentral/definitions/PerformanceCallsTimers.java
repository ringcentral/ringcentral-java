package com.ringcentral.definitions;


// Call length data for the specified grouping.
public class PerformanceCallsTimers {
    /**
     * Format: int64
     */
    public Long callsDurationSeconds;
    /**
     *
     */
    public TimeSpentBySegments callSegmentLengthSeconds;
    /**
     *
     */
    public CallsDurationByDirection callsByDirection;
    /**
     *
     */
    public CallsDurationByOrigin callsByOrigin;
    /**
     *
     */
    public CallDurationByResponse callsByResponse;
    /**
     *
     */
    public CallDurationByResult callsByResult;
    /**
     *
     */
    public CallDurationByResponseType callsByResponseType;
    /**
     *
     */
    public CallDurationByCompanyHours callsByCompanyHours;

    public PerformanceCallsTimers callsDurationSeconds(Long callsDurationSeconds) {
        this.callsDurationSeconds = callsDurationSeconds;
        return this;
    }

    public PerformanceCallsTimers callSegmentLengthSeconds(TimeSpentBySegments callSegmentLengthSeconds) {
        this.callSegmentLengthSeconds = callSegmentLengthSeconds;
        return this;
    }

    public PerformanceCallsTimers callsByDirection(CallsDurationByDirection callsByDirection) {
        this.callsByDirection = callsByDirection;
        return this;
    }

    public PerformanceCallsTimers callsByOrigin(CallsDurationByOrigin callsByOrigin) {
        this.callsByOrigin = callsByOrigin;
        return this;
    }

    public PerformanceCallsTimers callsByResponse(CallDurationByResponse callsByResponse) {
        this.callsByResponse = callsByResponse;
        return this;
    }

    public PerformanceCallsTimers callsByResult(CallDurationByResult callsByResult) {
        this.callsByResult = callsByResult;
        return this;
    }

    public PerformanceCallsTimers callsByResponseType(CallDurationByResponseType callsByResponseType) {
        this.callsByResponseType = callsByResponseType;
        return this;
    }

    public PerformanceCallsTimers callsByCompanyHours(CallDurationByCompanyHours callsByCompanyHours) {
        this.callsByCompanyHours = callsByCompanyHours;
        return this;
    }
}
