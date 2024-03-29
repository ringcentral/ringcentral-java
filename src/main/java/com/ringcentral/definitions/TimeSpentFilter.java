package com.ringcentral.definitions;


/**
 * Filtering of calls based on the time spent by specified mailbox(es) on call
 */
public class TimeSpentFilter {
    /**
     * Minimum duration in seconds
     * Format: int64
     */
    public Long minSeconds;
    /**
     * Maximum duration in seconds
     * Format: int64
     */
    public Long maxSeconds;

    public TimeSpentFilter minSeconds(Long minSeconds) {
        this.minSeconds = minSeconds;
        return this;
    }

    public TimeSpentFilter maxSeconds(Long maxSeconds) {
        this.maxSeconds = maxSeconds;
        return this;
    }
}
