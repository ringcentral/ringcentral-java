package com.ringcentral.definitions;


// Conditional aggregation of calls based on the overall call length
public class PerformanceCallsFilterByLength {
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    /**
     * Format: int64
     */
    public Long maxValueSeconds;

    public PerformanceCallsFilterByLength minValueSeconds(Long minValueSeconds) {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    public PerformanceCallsFilterByLength maxValueSeconds(Long maxValueSeconds) {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
