package com.ringcentral.definitions;


    /**
* Query parameters for operation listExtensions
*/
public class ListExtensionsParameters
{
    /**
     * Number of extension to be retrieved
     */
    public String extensionNumber;
    public ListExtensionsParameters extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Extension email address. Multiple values are accepted
     * Example: alice.smith@example.com&amp;email=bob.johnson@example.com
     */
    public String email;
    public ListExtensionsParameters email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Indicates a page number to retrieve. Only positive number values
    * are allowed
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListExtensionsParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    public ListExtensionsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Extension current state. Multiple values are supported. If &#039;Unassigned&#039;
    * is specified, then extensions without `extensionNumber` attribute are returned.
    * If not specified, then all extensions are returned
     * Enum: Enabled, Disabled, NotActivated, Unassigned
     */
    public String[] status;
    public ListExtensionsParameters status(String[] status)
    {
        this.status = status;
        return this;
    }

    /**
     * Extension type. Multiple values are supported. Please note
    * that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039;
    * extensions in modern RingCentral product terminology
     * Enum: User, FaxUser, FlexibleUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Limited, Bot, ProxyAdmin, DelegatedLinesGroup
     */
    public String[] type;
    public ListExtensionsParameters type(String[] type)
    {
        this.type = type;
        return this;
    }
}