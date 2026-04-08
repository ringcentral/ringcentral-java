package com.ringcentral.definitions;

public class CommDeviceForwardingTargetResource {
    /**
     * Ring target type Required Example: DeviceRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget,
     * IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommDeviceForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommDeviceResource device;

    public CommDeviceForwardingTargetResource device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommDeviceForwardingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** Device name Example: HP2 */
    public String name;

    public CommDeviceForwardingTargetResource name(String name) {
        this.name = name;
        return this;
    }
}
