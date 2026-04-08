package com.ringcentral.definitions;


    /**
* Notification payload body
*/
public class ExtensionGrantListEventBody
{
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public ExtensionGrantListEventBody extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public ExtensionGrantListEventBody ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }
}