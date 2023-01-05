package com.ringcentral.definitions;


    /**
* Query parameters for operation listExtensionGrants
*/
public class ListExtensionGrantsParameters
{
    /**
     * Type of extension to be returned. Multiple values are supported.
    * Please note that legacy &#039;Department&#039; extension type corresponds
    * to &#039;Call Queue&#039; extensions in modern RingCentral product terminology
     * Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Limited, Bot, Room
     */
    public String extensionType;
    public ListExtensionGrantsParameters extensionType(String extensionType)
    {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Default: 1
     */
    public String page;
    public ListExtensionGrantsParameters page(String page)
    {
        this.page = page;
        return this;
    }

    /**
     * Default: 100
     */
    public String perPage;
    public ListExtensionGrantsParameters perPage(String perPage)
    {
        this.perPage = perPage;
        return this;
    }
}