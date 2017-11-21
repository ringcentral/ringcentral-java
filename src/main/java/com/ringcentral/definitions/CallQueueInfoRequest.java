package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallQueueInfoRequest
{
    // Target percentage of calls that must be answered by agents within the service level time threshold
    public Long slaGoal;
    public CallQueueInfoRequest slaGoal(Long slaGoal) {
        this.slaGoal = slaGoal;
        return this;
    }
    //
    public Long slaThresholdSeconds;
    public CallQueueInfoRequest slaThresholdSeconds(Long slaThresholdSeconds) {
        this.slaThresholdSeconds = slaThresholdSeconds;
        return this;
    }
    //
    public Boolean includeAbandonedCalls;
    public CallQueueInfoRequest includeAbandonedCalls(Boolean includeAbandonedCalls) {
        this.includeAbandonedCalls = includeAbandonedCalls;
        return this;
    }
    //
    public Long abandonedThresholdSeconds;
    public CallQueueInfoRequest abandonedThresholdSeconds(Long abandonedThresholdSeconds) {
        this.abandonedThresholdSeconds = abandonedThresholdSeconds;
        return this;
    }
}
