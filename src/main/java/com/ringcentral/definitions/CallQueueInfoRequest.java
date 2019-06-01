package com.ringcentral.definitions;


public class CallQueueInfoRequest {
    /**
     * Target percentage of calls that must be answered by agents within the service level time threshold
     */
    public Long slaGoal;
    /**
     *
     */
    public Long slaThresholdSeconds;
    /**
     *
     */
    public Boolean includeAbandonedCalls;
    /**
     *
     */
    public Long abandonedThresholdSeconds;

    public CallQueueInfoRequest slaGoal(Long slaGoal) {
        this.slaGoal = slaGoal;
        return this;
    }

    public CallQueueInfoRequest slaThresholdSeconds(Long slaThresholdSeconds) {
        this.slaThresholdSeconds = slaThresholdSeconds;
        return this;
    }

    public CallQueueInfoRequest includeAbandonedCalls(Boolean includeAbandonedCalls) {
        this.includeAbandonedCalls = includeAbandonedCalls;
        return this;
    }

    public CallQueueInfoRequest abandonedThresholdSeconds(Long abandonedThresholdSeconds) {
        this.abandonedThresholdSeconds = abandonedThresholdSeconds;
        return this;
    }

}
