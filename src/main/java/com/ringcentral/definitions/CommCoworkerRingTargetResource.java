package com.ringcentral.definitions;


    /**
* Ring target
*/
public class CommCoworkerRingTargetResource
{
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    public CommCoworkerRingTargetResource extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: CoworkerRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommCoworkerRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public String name;
    public CommCoworkerRingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }
}