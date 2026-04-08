package com.ringcentral.definitions;


    /**
* All Desktop Ring target
*/
public class CommAllDesktopTargetRequest
{
    /**
     */
    public CommReferencedExtensionResource extension;
    public CommAllDesktopTargetRequest extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Example: AllDesktopRingTarget
     * Enum: AllDesktopRingTarget
     */
    public String type;
    public CommAllDesktopTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }
}