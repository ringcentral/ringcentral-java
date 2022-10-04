package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter {
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    /**
     * Format: int64
     */
    public Long maxValueSeconds;

    public AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter minValueSeconds(Long minValueSeconds) {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter maxValueSeconds(Long maxValueSeconds) {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
