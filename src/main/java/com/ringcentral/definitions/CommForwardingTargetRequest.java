package com.ringcentral.definitions;


public class CommForwardingTargetRequest {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommForwardingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    public CommForwardingTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
