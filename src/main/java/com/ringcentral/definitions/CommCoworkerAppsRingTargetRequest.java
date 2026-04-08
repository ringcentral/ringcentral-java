package com.ringcentral.definitions;


    /**
* Coworker apps target
*/
public class CommCoworkerAppsRingTargetRequest
{
    /**
     */
    public String name;
    public CommCoworkerAppsRingTargetRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: CoworkerAppsRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommCoworkerAppsRingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    public CommCoworkerAppsRingTargetRequest extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }
}