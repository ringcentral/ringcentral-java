package com.ringcentral.definitions;


// Conditional aggregation of calls based on the time spent on a call by the specified mailbox(es)
public class PerformanceCallsFilterTimeSpentByMailbox {
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    /**
     * Format: int64
     */
    public Long maxValueSeconds;

    public PerformanceCallsFilterTimeSpentByMailbox minValueSeconds(Long minValueSeconds) {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    public PerformanceCallsFilterTimeSpentByMailbox maxValueSeconds(Long maxValueSeconds) {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
