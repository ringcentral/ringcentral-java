package com.ringcentral.definitions;


public class PartySuperviseRequest
{
    /**
     * Supervising mode
     * Required
     * Example: Listen
     * Enum: Listen
     */
    public String mode;
    public PartySuperviseRequest mode(String mode)
    {
        this.mode = mode;
        return this;
    }

    /**
     * Internal identifier of a supervisor&#039;s device
     * Required
     * Example: 191888004
     */
    public String supervisorDeviceId;
    public PartySuperviseRequest supervisorDeviceId(String supervisorDeviceId)
    {
        this.supervisorDeviceId = supervisorDeviceId;
        return this;
    }

    /**
     * Mailbox ID of a user that will be monitored
     * Required
     * Example: 400378008008
     */
    public String agentExtensionId;
    public PartySuperviseRequest agentExtensionId(String agentExtensionId)
    {
        this.agentExtensionId = agentExtensionId;
        return this;
    }

    /**
     * Specifies if auto-answer SIP header should be sent. If auto-answer is set to &#039;True&#039;, the call is automatically answered by the supervising party, if set to &#039;False&#039; - then the supervising party has to accept or decline the monitored call
     * Default: true
     */
    public Boolean autoAnswer;
    public PartySuperviseRequest autoAnswer(Boolean autoAnswer)
    {
        this.autoAnswer = autoAnswer;
        return this;
    }

    /**
     * Specifies session description protocol (SDP) setting. The possible values are &#039;sendOnly&#039; (only sending) meaning one-way audio streaming; and &#039;sendRecv&#039; (sending/receiving) meaning two-way audio streaming
     * Enum: sendOnly, sendRecv
     */
    public String mediaSDP;
    public PartySuperviseRequest mediaSDP(String mediaSDP)
    {
        this.mediaSDP = mediaSDP;
        return this;
    }
}