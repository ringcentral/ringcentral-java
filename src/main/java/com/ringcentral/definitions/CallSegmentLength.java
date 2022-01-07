package com.ringcentral.definitions;


public class CallSegmentLength {
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    /**
     * Format: int64
     */
    public Long maxValueSeconds;

    public CallSegmentLength minValueSeconds(Long minValueSeconds) {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    public CallSegmentLength maxValueSeconds(Long maxValueSeconds) {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
