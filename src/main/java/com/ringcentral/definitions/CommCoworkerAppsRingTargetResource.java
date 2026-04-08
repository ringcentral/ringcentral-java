package com.ringcentral.definitions;


    /**
* Coworker apps target
*/
public class CommCoworkerAppsRingTargetResource
{
    /**
     * Ring target type
     * Required
     * Example: CoworkerAppsRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommCoworkerAppsRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    public CommCoworkerAppsRingTargetResource extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }
}