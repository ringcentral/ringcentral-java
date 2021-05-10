package com.ringcentral.definitions;


// Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
public class QueueInfo {
    /**
     * Specifies how calls are transferred to group members
     * Enum: Rotating, Simultaneous, FixedOrder
     */
    public String transferMode;
    /**
     * Call transfer information
     */
    public TransferInfo[] transfer;
    /**
     * Specifies the type of action to be taken if: members are available but no one answers, or all members are busy/unavailable. This option is available for Business hours only. For simultaneous transfer mode only 'WaitPrimaryMembers' and 'WaitPrimaryAndOverflowMembers' are supported
     * Enum: WaitPrimaryMembers, WaitPrimaryAndOverflowMembers, Voicemail, TransferToExtension, UnconditionalForwarding
     */
    public String noAnswerAction;
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
     * Specifies the type of action to be taken after the hold time (waiting for an available call queue member) expires. If 'TransferToExtension' option is selected, the extension specified in `transfer` field is used. The default value is `Voicemail`
     * Default: Voicemail
     * Enum: TransferToExtension, UnconditionalForwarding, Voicemail
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
     * Specifies the type of action to be taken if count of callers on hold exceeds the supported maximum
     * Enum: Voicemail, Announcement, TransferToExtension, UnconditionalForwarding
     */
    public String maxCallersAction;
    /**
     *
     */
    public UnconditionalForwardingInfo[] unconditionalForwarding;

    public QueueInfo transferMode(String transferMode) {
        this.transferMode = transferMode;
        return this;
    }

    public QueueInfo transfer(TransferInfo[] transfer) {
        this.transfer = transfer;
        return this;
    }

    public QueueInfo noAnswerAction(String noAnswerAction) {
        this.noAnswerAction = noAnswerAction;
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

    public QueueInfo unconditionalForwarding(UnconditionalForwardingInfo[] unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }
}
