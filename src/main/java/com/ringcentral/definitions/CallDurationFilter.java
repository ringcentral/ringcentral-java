package com.ringcentral.definitions;


/**
 * Filtering of calls based on the overall call length
 */
public class CallDurationFilter {
    /**
     * Minimum duration of call in seconds
     * Format: int64
     */
    public Long minSeconds;
    /**
     * Maximum duration of call in seconds
     * Format: int64
     */
    public Long maxSeconds;

    public CallDurationFilter minSeconds(Long minSeconds) {
        this.minSeconds = minSeconds;
        return this;
    }

    public CallDurationFilter maxSeconds(Long maxSeconds) {
        this.maxSeconds = maxSeconds;
        return this;
    }
}
