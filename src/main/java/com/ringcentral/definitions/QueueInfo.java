package com.ringcentral.definitions;


    /**
* Queue settings applied for department (call queue) extension type,
* with the 'AgentQueue' value specified as a call handling action
* 
*/
public class QueueInfo
{
    /**
     * Specifies how calls are transferred to group members
     * Enum: Rotating, Simultaneous, FixedOrder
     */
    public String transferMode;
    public QueueInfo transferMode(String transferMode)
    {
        this.transferMode = transferMode;
        return this;
    }

    /**
     * Call transfer information
     */
    public TransferInfo[] transfer;
    public QueueInfo transfer(TransferInfo[] transfer)
    {
        this.transfer = transfer;
        return this;
    }

    /**
     * Specifies the type of action to be taken if: members are available but no one answers, or all members are busy/unavailable. This option is available for Business hours only. For simultaneous transfer mode only &#039;WaitPrimaryMembers&#039; and &#039;WaitPrimaryAndOverflowMembers&#039; are supported
     * Enum: WaitPrimaryMembers, WaitPrimaryAndOverflowMembers, Voicemail, TransferToExtension, UnconditionalForwarding
     */
    public String noAnswerAction;
    public QueueInfo noAnswerAction(String noAnswerAction)
    {
        this.noAnswerAction = noAnswerAction;
        return this;
    }

    /**
     * Information on a call forwarding rule
     */
    public FixedOrderAgents[] fixedOrderAgents;
    public QueueInfo fixedOrderAgents(FixedOrderAgents[] fixedOrderAgents)
    {
        this.fixedOrderAgents = fixedOrderAgents;
        return this;
    }

    /**
     * Connecting audio interruption mode
     * Enum: Never, WhenMusicEnds, Periodically
     */
    public String holdAudioInterruptionMode;
    public QueueInfo holdAudioInterruptionMode(String holdAudioInterruptionMode)
    {
        this.holdAudioInterruptionMode = holdAudioInterruptionMode;
        return this;
    }

    /**
     * Connecting audio interruption message period in seconds
     * Format: int32
     */
    public Long holdAudioInterruptionPeriod;
    public QueueInfo holdAudioInterruptionPeriod(Long holdAudioInterruptionPeriod)
    {
        this.holdAudioInterruptionPeriod = holdAudioInterruptionPeriod;
        return this;
    }

    /**
     * Specifies the type of action to be taken after the hold time (waiting for an available call queue member) expires. If &#039;TransferToExtension&#039; option is selected, the extension specified in `transfer` field is used. The default value is `Voicemail`
     * Default: Voicemail
     * Enum: TransferToExtension, UnconditionalForwarding, Voicemail
     */
    public String holdTimeExpirationAction;
    public QueueInfo holdTimeExpirationAction(String holdTimeExpirationAction)
    {
        this.holdTimeExpirationAction = holdTimeExpirationAction;
        return this;
    }

    /**
     * Maximum time in seconds to wait for a call queue member before trying the next member
     * Format: int32
     */
    public Long agentTimeout;
    public QueueInfo agentTimeout(Long agentTimeout)
    {
        this.agentTimeout = agentTimeout;
        return this;
    }

    /**
     * Minimum post-call wrap up time in seconds before agent status
    * is automatically set; the value range is from 180 to 300
     * Maximum: 300
     * Minimum: 180
     * Format: int32
     */
    public Long wrapUpTime;
    public QueueInfo wrapUpTime(Long wrapUpTime)
    {
        this.wrapUpTime = wrapUpTime;
        return this;
    }

    /**
     * Maximum hold time in seconds to wait for an available call queue member
     * Format: int32
     */
    public Long holdTime;
    public QueueInfo holdTime(Long holdTime)
    {
        this.holdTime = holdTime;
        return this;
    }

    /**
     * Maximum count of callers on hold; the limitation is 25 callers
     * Maximum: 25
     * Format: int32
     */
    public Long maxCallers;
    public QueueInfo maxCallers(Long maxCallers)
    {
        this.maxCallers = maxCallers;
        return this;
    }

    /**
     * Specifies the type of action to be taken if count of callers on hold exceeds the supported maximum
     * Enum: Voicemail, Announcement, TransferToExtension, UnconditionalForwarding
     */
    public String maxCallersAction;
    public QueueInfo maxCallersAction(String maxCallersAction)
    {
        this.maxCallersAction = maxCallersAction;
        return this;
    }

    /**
     */
    public UnconditionalForwardingInfo[] unconditionalForwarding;
    public QueueInfo unconditionalForwarding(UnconditionalForwardingInfo[] unconditionalForwarding)
    {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }
}