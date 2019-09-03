package com.ringcentral.definitions;


public class SuperviseCallSessionRequest {
    /**
     * Supervising mode
     * Required
     * Enum: Listen
     */
    public String mode;
    /**
     * Internal identifier of a supervisor's device which will be used for call session monitoring
     * Required
     */
    public String supervisorDeviceId;
    /**
     * Extension number of the user that will be monitored
     */
    public String agentExtensionNumber;
    /**
     * Extension identifier of the user that will be monitored
     */
    public String agentExtensionId;

    public SuperviseCallSessionRequest mode(String mode) {
        this.mode = mode;
        return this;
    }

    public SuperviseCallSessionRequest supervisorDeviceId(String supervisorDeviceId) {
        this.supervisorDeviceId = supervisorDeviceId;
        return this;
    }

    public SuperviseCallSessionRequest agentExtensionNumber(String agentExtensionNumber) {
        this.agentExtensionNumber = agentExtensionNumber;
        return this;
    }

    public SuperviseCallSessionRequest agentExtensionId(String agentExtensionId) {
        this.agentExtensionId = agentExtensionId;
        return this;
    }

}
