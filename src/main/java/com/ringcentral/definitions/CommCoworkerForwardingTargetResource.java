package com.ringcentral.definitions;


    /**
* Ring target
*/
public class CommCoworkerForwardingTargetResource
{
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    public CommCoworkerForwardingTargetResource extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: CoworkerRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommCoworkerForwardingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }
}