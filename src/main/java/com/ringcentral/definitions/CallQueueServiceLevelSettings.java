package com.ringcentral.definitions;


public class CallQueueServiceLevelSettings {
    /**
     * Target percentage of calls that must be answered by agents within the service level time threshold
     */
    public Long slaGoal;
    /**
     * The period of time in seconds that is considered to be an acceptable service level
     */
    public Long slaThresholdSeconds;
    /**
     * Includes abandoned calls (when callers hang up prior to being served by an agent) into service-level calculation
     */
    public Boolean includeAbandonedCalls;
    /**
     * Abandoned calls that are shorter than the defined period of time in seconds will not be included into the calculation of Service Level
     */
    public Long abandonedThresholdSeconds;

    public CallQueueServiceLevelSettings slaGoal(Long slaGoal) {
        this.slaGoal = slaGoal;
        return this;
    }

    public CallQueueServiceLevelSettings slaThresholdSeconds(Long slaThresholdSeconds) {
        this.slaThresholdSeconds = slaThresholdSeconds;
        return this;
    }

    public CallQueueServiceLevelSettings includeAbandonedCalls(Boolean includeAbandonedCalls) {
        this.includeAbandonedCalls = includeAbandonedCalls;
        return this;
    }

    public CallQueueServiceLevelSettings abandonedThresholdSeconds(Long abandonedThresholdSeconds) {
        this.abandonedThresholdSeconds = abandonedThresholdSeconds;
        return this;
    }

}
