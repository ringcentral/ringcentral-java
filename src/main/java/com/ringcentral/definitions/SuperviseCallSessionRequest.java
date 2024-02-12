package com.ringcentral.definitions;


public class SuperviseCallSessionRequest {
    /**
     * Supervising mode
     * Required
     * Example: Listen
     * Enum: Listen
     */
    public String mode;
    /**
     * Internal identifier of a supervisor&#039;s device which will be used for call session monitoring
     * Required
     * Example: 191888004
     */
    public String supervisorDeviceId;
    /**
     * Extension identifier of the user that will be monitored
     * Example: 400378008008
     */
    public String agentExtensionId;
    /**
     * Specifies if auto-answer SIP header should be sent. If auto-answer is set to `true`, the call is automatically answered by the supervising party, if set to `false` - then the supervising party has to accept or decline the monitored call
     * Default: true
     */
    public Boolean autoAnswer;
    /**
     * Specifies session description protocol setting
     * Enum: sendOnly, sendRecv
     */
    public String mediaSDP;

    public SuperviseCallSessionRequest mode(String mode) {
        this.mode = mode;
        return this;
    }

    public SuperviseCallSessionRequest supervisorDeviceId(String supervisorDeviceId) {
        this.supervisorDeviceId = supervisorDeviceId;
        return this;
    }

    public SuperviseCallSessionRequest agentExtensionId(String agentExtensionId) {
        this.agentExtensionId = agentExtensionId;
        return this;
    }

    public SuperviseCallSessionRequest autoAnswer(Boolean autoAnswer) {
        this.autoAnswer = autoAnswer;
        return this;
    }

    public SuperviseCallSessionRequest mediaSDP(String mediaSDP) {
        this.mediaSDP = mediaSDP;
        return this;
    }
}
