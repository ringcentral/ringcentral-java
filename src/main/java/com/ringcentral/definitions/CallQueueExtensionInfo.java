package com.ringcentral.definitions;


public class CallQueueExtensionInfo {
    /**
     * Target percentage of calls that must be answered by agents within the service level time threshold
     */
    public Long slaGoal;
    /**
     * Period of time in seconds that is considered to be an acceptable service level
     */
    public Long slaThresholdSeconds;
    /**
     * If 'True' abandoned calls (hanged up prior to being served) are included into service level calculation
     */
    public Boolean includeAbandonedCalls;
    /**
     * Period of time in seconds specifying abandoned calls duration - calls that are shorter will not be included into the calculation of service level.; zero value means that abandoned calls of any duration will be included into calculation
     */
    public Long abandonedThresholdSeconds;

    public CallQueueExtensionInfo slaGoal(Long slaGoal) {
        this.slaGoal = slaGoal;
        return this;
    }

    public CallQueueExtensionInfo slaThresholdSeconds(Long slaThresholdSeconds) {
        this.slaThresholdSeconds = slaThresholdSeconds;
        return this;
    }

    public CallQueueExtensionInfo includeAbandonedCalls(Boolean includeAbandonedCalls) {
        this.includeAbandonedCalls = includeAbandonedCalls;
        return this;
    }

    public CallQueueExtensionInfo abandonedThresholdSeconds(Long abandonedThresholdSeconds) {
        this.abandonedThresholdSeconds = abandonedThresholdSeconds;
        return this;
    }

}
