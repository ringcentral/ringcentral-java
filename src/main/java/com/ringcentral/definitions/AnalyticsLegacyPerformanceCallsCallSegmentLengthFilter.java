package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter
{
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    public AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter minValueSeconds(Long minValueSeconds)
    {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    /**
     * Format: int64
     */
    public Long maxValueSeconds;
    public AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter maxValueSeconds(Long maxValueSeconds)
    {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}