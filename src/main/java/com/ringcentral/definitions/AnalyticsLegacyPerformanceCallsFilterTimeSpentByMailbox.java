package com.ringcentral.definitions;


/**
 * Conditional aggregation of calls based on the time spent by specified mailbox(es) on call
 */
public class AnalyticsLegacyPerformanceCallsFilterTimeSpentByMailbox {
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    /**
     * Format: int64
     */
    public Long maxValueSeconds;

    public AnalyticsLegacyPerformanceCallsFilterTimeSpentByMailbox minValueSeconds(Long minValueSeconds) {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsFilterTimeSpentByMailbox maxValueSeconds(Long maxValueSeconds) {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
