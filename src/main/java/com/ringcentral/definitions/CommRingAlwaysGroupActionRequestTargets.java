package com.ringcentral.definitions;


public class CommRingAlwaysGroupActionRequestTargets
{
    /**
     * Ring target type
     * Example: AllMobileRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommRingAlwaysGroupActionRequestTargets type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommRingAlwaysGroupActionRequestTargets extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }
}