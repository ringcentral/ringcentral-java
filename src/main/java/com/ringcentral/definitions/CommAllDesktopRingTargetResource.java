package com.ringcentral.definitions;


    /**
* All Desktop Ring target
*/
public class CommAllDesktopRingTargetResource
{
    /**
     * Required
     */
    public String name;
    public CommAllDesktopRingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: AllDesktopRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommAllDesktopRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommAllDesktopRingTargetResource extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }
}