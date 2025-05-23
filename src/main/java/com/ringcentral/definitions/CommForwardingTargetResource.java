package com.ringcentral.definitions;


public class CommForwardingTargetResource {
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

    public CommForwardingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
