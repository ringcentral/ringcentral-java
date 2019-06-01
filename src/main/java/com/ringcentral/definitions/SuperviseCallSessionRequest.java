package com.ringcentral.definitions;


public class SuperviseCallSessionRequest {
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
    public String deviceId;
    /**
     * Extension number of a user that will be monitored
     * Required
     */
    public String extensionNumber;

    public SuperviseCallSessionRequest mode(String mode) {
        this.mode = mode;
        return this;
    }

    public SuperviseCallSessionRequest deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public SuperviseCallSessionRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}
