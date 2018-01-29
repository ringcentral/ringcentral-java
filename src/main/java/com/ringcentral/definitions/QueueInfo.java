package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class QueueInfo
{
    // Specifies how calls are transferred to group members
    public String transferMode;
    public QueueInfo transferMode(String transferMode) {
        this.transferMode = transferMode;
        return this;
    }
    // Information on a call forwarding rule
    public FixedOrderAgents[] fixedOrderAgents;
    public QueueInfo fixedOrderAgents(FixedOrderAgents[] fixedOrderAgents) {
        this.fixedOrderAgents = fixedOrderAgents;
        return this;
    }
    // Connecting audio interruption mode
    public String holdAudioInterruptionMode;
    public QueueInfo holdAudioInterruptionMode(String holdAudioInterruptionMode) {
        this.holdAudioInterruptionMode = holdAudioInterruptionMode;
        return this;
    }
    // Connecting audio interruption message period in seconds
    public Long holdAudioInterruptionPeriod;
    public QueueInfo holdAudioInterruptionPeriod(Long holdAudioInterruptionPeriod) {
        this.holdAudioInterruptionPeriod = holdAudioInterruptionPeriod;
        return this;
    }
    // Maximum time in seconds to wait for a call queue member before trying the next member
    public Long agentTimeout;
    public QueueInfo agentTimeout(Long agentTimeout) {
        this.agentTimeout = agentTimeout;
        return this;
    }
    // Minimum post-call wrap up time in seconds before agent status is automatically set
    public Long wrapUpTime;
    public QueueInfo wrapUpTime(Long wrapUpTime) {
        this.wrapUpTime = wrapUpTime;
        return this;
    }
    // Maximum hold time in seconds to wait for an available call queue member
    public Long holdTime;
    public QueueInfo holdTime(Long holdTime) {
        this.holdTime = holdTime;
        return this;
    }
    // Maximum count of callers on hold
    public Long maxCallers;
    public QueueInfo maxCallers(Long maxCallers) {
        this.maxCallers = maxCallers;
        return this;
    }
    // Action which should be taken if count of callers on hold exceeds the maximum
    public String maxCallersAction;
    public QueueInfo maxCallersAction(String maxCallersAction) {
        this.maxCallersAction = maxCallersAction;
        return this;
    }
}
