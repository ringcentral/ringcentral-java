package com.ringcentral.definitions;


public class PartySuperviseRequest {
    /**
     * Supervising mode
     * Required
     * Example: Listen
     * Enum: Listen
     */
    public String mode;
    /**
     * Internal identifier of a supervisor&#039;s device
     * Required
     * Example: 191888004
     */
    public String supervisorDeviceId;
    /**
     * Mailbox ID of a user that will be monitored
     * Required
     * Example: 400378008008
     */
    public String agentExtensionId;
    /**
     * Specifies if auto-answer SIP header should be sent. If auto-answer is set to &#039;True&#039;, the call is automatically answered by the supervising party, if set to &#039;False&#039; - then the supervising party has to accept or decline the monitored call
     * Default: true
     */
    public Boolean autoAnswer;

    public PartySuperviseRequest mode(String mode) {
        this.mode = mode;
        return this;
    }

    public PartySuperviseRequest supervisorDeviceId(String supervisorDeviceId) {
        this.supervisorDeviceId = supervisorDeviceId;
        return this;
    }

    public PartySuperviseRequest agentExtensionId(String agentExtensionId) {
        this.agentExtensionId = agentExtensionId;
        return this;
    }

    public PartySuperviseRequest autoAnswer(Boolean autoAnswer) {
        this.autoAnswer = autoAnswer;
        return this;
    }
}
