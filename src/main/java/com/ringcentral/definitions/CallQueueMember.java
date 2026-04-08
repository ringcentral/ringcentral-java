package com.ringcentral.definitions;


    /**
* Call queue member information
*/
public class CallQueueMember
{
    /**
     * Internal identifier of an extension - queue member
     */
    public String id;
    public CallQueueMember id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Extension full name
     */
    public String name;
    public CallQueueMember name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension number
     */
    public String extensionNumber;
    public CallQueueMember extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     */
    public SiteBasicInfo site;
    public CallQueueMember site(SiteBasicInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     * Extension subtype, if applicable.
    * For unrecognized subtypes the `Unknown` value is returned
     * Enum: VideoPro, VideoProPlus, DigitalSignageOnlyRooms, Unknown, Emergency
     */
    public String extensionSubType;
    public CallQueueMember extensionSubType(String extensionSubType)
    {
        this.extensionSubType = extensionSubType;
        return this;
    }
}