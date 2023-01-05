package com.ringcentral.definitions;


public class SuperviseCallSessionRequest
{
    /**
     * Supervising mode
     * Required
     * Example: Listen
     * Enum: Listen
     */
    public String mode;
    public SuperviseCallSessionRequest mode(String mode)
    {
        this.mode = mode;
        return this;
    }

    /**
     * Internal identifier of a supervisor&#039;s device which will be used for call session monitoring
     * Required
     * Example: 191888004
     */
    public String supervisorDeviceId;
    public SuperviseCallSessionRequest supervisorDeviceId(String supervisorDeviceId)
    {
        this.supervisorDeviceId = supervisorDeviceId;
        return this;
    }

    /**
     * Extension identifier of the user that will be monitored
     * Example: 400378008008
     */
    public String agentExtensionId;
    public SuperviseCallSessionRequest agentExtensionId(String agentExtensionId)
    {
        this.agentExtensionId = agentExtensionId;
        return this;
    }

    /**
     * Specifies if auto-answer SIP header should be sent. If auto-answer is set to &#039;True&#039;, the call is automatically answered by the supervising party, if set to &#039;False&#039; - then the supervising party has to accept or decline the monitored call
     * Default: true
     */
    public Boolean autoAnswer;
    public SuperviseCallSessionRequest autoAnswer(Boolean autoAnswer)
    {
        this.autoAnswer = autoAnswer;
        return this;
    }

    /**
     * Specifies session description protocol setting
     * Enum: sendOnly, sendRecv
     */
    public String mediaSDP;
    public SuperviseCallSessionRequest mediaSDP(String mediaSDP)
    {
        this.mediaSDP = mediaSDP;
        return this;
    }
}