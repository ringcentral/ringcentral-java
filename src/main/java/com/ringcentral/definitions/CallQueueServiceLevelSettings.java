package com.ringcentral.definitions;


    /**
* Call queue service level settings
*/
public class CallQueueServiceLevelSettings
{
    /**
     * Target percentage of calls that must be answered by agents
    * within the service level time threshold
     * Format: int32
     */
    public Long slaGoal;
    public CallQueueServiceLevelSettings slaGoal(Long slaGoal)
    {
        this.slaGoal = slaGoal;
        return this;
    }

    /**
     * The period of time in seconds that is considered to be an acceptable
    * service level
     * Format: int32
     */
    public Long slaThresholdSeconds;
    public CallQueueServiceLevelSettings slaThresholdSeconds(Long slaThresholdSeconds)
    {
        this.slaThresholdSeconds = slaThresholdSeconds;
        return this;
    }

    /**
     * Includes abandoned calls (when callers hang up prior to being
    * served by an agent) into service-level calculation
     */
    public Boolean includeAbandonedCalls;
    public CallQueueServiceLevelSettings includeAbandonedCalls(Boolean includeAbandonedCalls)
    {
        this.includeAbandonedCalls = includeAbandonedCalls;
        return this;
    }

    /**
     * Abandoned calls that are shorter than the defined period of
    * time in seconds will not be included into the calculation of Service Level
     * Format: int32
     */
    public Long abandonedThresholdSeconds;
    public CallQueueServiceLevelSettings abandonedThresholdSeconds(Long abandonedThresholdSeconds)
    {
        this.abandonedThresholdSeconds = abandonedThresholdSeconds;
        return this;
    }
}