package com.ringcentral.definitions;


    /**
* For Call Queue extension type only. Please note that legacy 'Department'
* extension type corresponds to 'Call Queue' extensions in modern RingCentral
* product terminology
* 
*/
public class CallQueueInfoRequest
{
    /**
     * Target percentage of calls that must be answered by agents
    * within the service level time threshold
     * Format: int32
     */
    public Long slaGoal;
    public CallQueueInfoRequest slaGoal(Long slaGoal)
    {
        this.slaGoal = slaGoal;
        return this;
    }

    /**
     * Format: int32
     */
    public Long slaThresholdSeconds;
    public CallQueueInfoRequest slaThresholdSeconds(Long slaThresholdSeconds)
    {
        this.slaThresholdSeconds = slaThresholdSeconds;
        return this;
    }

    /**
     * Format: int32
     */
    public Boolean includeAbandonedCalls;
    public CallQueueInfoRequest includeAbandonedCalls(Boolean includeAbandonedCalls)
    {
        this.includeAbandonedCalls = includeAbandonedCalls;
        return this;
    }

    /**
     * Format: int32
     */
    public Long abandonedThresholdSeconds;
    public CallQueueInfoRequest abandonedThresholdSeconds(Long abandonedThresholdSeconds)
    {
        this.abandonedThresholdSeconds = abandonedThresholdSeconds;
        return this;
    }
}