package com.ringcentral.definitions;


public class QueueInfo {
    /**
     * Specifies how calls are transferred to group members
     * Enum: Rotating, Simultaneous, FixedOrder
     */
    public String transferMode;
    /**
     * Information on a call forwarding rule
     */
    public FixedOrderAgents[] fixedOrderAgents;
    /**
     * Connecting audio interruption mode
     * Enum: Never, WhenMusicEnds, Periodically
     */
    public String holdAudioInterruptionMode;
    /**
     * Connecting audio interruption message period in seconds
     */
    public Long holdAudioInterruptionPeriod;
    /**
     * Specifies the type of action to be taken after the hold time (waiting for an available call queue member) expires. If 'TransferToExtension' option is selected, the extension specified in `transfer` field is used
     * Default: Voicemail
     * Enum: TransferToExtension, Voicemail
     */
    public String holdTimeExpirationAction;
    /**
     * Maximum time in seconds to wait for a call queue member before trying the next member
     */
    public Long agentTimeout;
    /**
     * Minimum post-call wrap up time in seconds before agent status is automatically set; the value range is from 180 to 300
     */
    public Long wrapUpTime;
    /**
     * Maximum hold time in seconds to wait for an available call queue member
     */
    public Long holdTime;
    /**
     * Maximum count of callers on hold; the limitation is 25 callers
     */
    public Long maxCallers;
    /**
     * Action which should be taken if count of callers on hold exceeds the maximum
     * Enum: Voicemail, Announcement
     */
    public String maxCallersAction;

    public QueueInfo transferMode(String transferMode) {
        this.transferMode = transferMode;
        return this;
    }

    public QueueInfo fixedOrderAgents(FixedOrderAgents[] fixedOrderAgents) {
        this.fixedOrderAgents = fixedOrderAgents;
        return this;
    }

    public QueueInfo holdAudioInterruptionMode(String holdAudioInterruptionMode) {
        this.holdAudioInterruptionMode = holdAudioInterruptionMode;
        return this;
    }

    public QueueInfo holdAudioInterruptionPeriod(Long holdAudioInterruptionPeriod) {
        this.holdAudioInterruptionPeriod = holdAudioInterruptionPeriod;
        return this;
    }

    public QueueInfo holdTimeExpirationAction(String holdTimeExpirationAction) {
        this.holdTimeExpirationAction = holdTimeExpirationAction;
        return this;
    }

    public QueueInfo agentTimeout(Long agentTimeout) {
        this.agentTimeout = agentTimeout;
        return this;
    }

    public QueueInfo wrapUpTime(Long wrapUpTime) {
        this.wrapUpTime = wrapUpTime;
        return this;
    }

    public QueueInfo holdTime(Long holdTime) {
        this.holdTime = holdTime;
        return this;
    }

    public QueueInfo maxCallers(Long maxCallers) {
        this.maxCallers = maxCallers;
        return this;
    }

    public QueueInfo maxCallersAction(String maxCallersAction) {
        this.maxCallersAction = maxCallersAction;
        return this;
    }

}
