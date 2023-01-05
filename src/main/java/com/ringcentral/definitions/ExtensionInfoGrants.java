package com.ringcentral.definitions;


    /**
* Extension information
*/
public class ExtensionInfoGrants
{
    /**
     * Internal identifier of an extension
     */
    public String id;
    public ExtensionInfoGrants id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of an extension
     * Format: uri
     */
    public String uri;
    public ExtensionInfoGrants uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Extension short number (usually 3 or 4 digits)
     */
    public String extensionNumber;
    public ExtensionInfoGrants extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Name of extension
     */
    public String name;
    public ExtensionInfoGrants name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension type. Please note that legacy &#039;Department&#039;
    * extension type corresponds to &#039;Call Queue&#039; extensions in modern RingCentral
    * product terminology
     * Enum: User, Fax User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation
     */
    public String type;
    public ExtensionInfoGrants type(String type)
    {
        this.type = type;
        return this;
    }
}