package com.ringcentral.definitions;


    /**
* Ring target
*/
public class CommCoworkerRingTargetRequest
{
    /**
     * Ring target type
     * Required
     * Example: CoworkerRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommCoworkerRingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    public CommCoworkerRingTargetRequest extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }
}