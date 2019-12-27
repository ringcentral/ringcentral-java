package com.ringcentral.definitions;


public class PartySuperviseRequest {
    /**
     * Supervising mode
     * Required
     * Enum: Listen
     */
    public String mode;
    /**
     * Internal identifier of a supervisor's device
     * Required
     */
    public String supervisorDeviceId;
    /**
     * Mailbox ID of a user that will be monitored
     * Required
     */
    public String agentExtensionId;

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

}
