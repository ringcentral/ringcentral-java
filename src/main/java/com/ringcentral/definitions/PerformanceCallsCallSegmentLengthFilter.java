package com.ringcentral.definitions;


public class PerformanceCallsCallSegmentLengthFilter {
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    /**
     * Format: int64
     */
    public Long maxValueSeconds;

    public PerformanceCallsCallSegmentLengthFilter minValueSeconds(Long minValueSeconds) {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    public PerformanceCallsCallSegmentLengthFilter maxValueSeconds(Long maxValueSeconds) {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
