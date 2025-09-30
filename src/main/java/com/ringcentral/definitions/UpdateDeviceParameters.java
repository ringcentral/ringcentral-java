package com.ringcentral.definitions;


/**
 * Query parameters for operation updateDevice
 */
public class UpdateDeviceParameters {
    /**
     * Specifies if pre-statement should be generated.
     */
    public Boolean prestatement;

    public UpdateDeviceParameters prestatement(Boolean prestatement) {
        this.prestatement = prestatement;
        return this;
    }
}
