package com.ringcentral.definitions;


    /**
* Notification payload body
*/
public class ExtensionFavoritesEventBody
{
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public ExtensionFavoritesEventBody extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public ExtensionFavoritesEventBody ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }
}