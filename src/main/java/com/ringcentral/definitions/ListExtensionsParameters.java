package com.ringcentral.definitions;


/**
 * Query parameters for operation listExtensions
 */
public class ListExtensionsParameters {
    /**
     * Extension short number to filter records
     */
    public String extensionNumber;
    /**
     * Extension email address. Multiple values are accepted
     * Example: alice.smith@example.com,bob.johnson@example.com
     */
    public String[] email;
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are allowed
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    /**
     * Extension status. Multiple values are supported. If `Unassigned`
     * is specified, then extensions without `extensionNumber` attribute are returned.
     * If not specified, then all extensions are returned
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
     */
    public String[] status;
    /**
     * Extension type. Please note
     * that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039;
     * extensions in modern RingCentral product terminology
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, DelegatedLinesGroup, GroupCallPickup, IvrMenu, ApplicationExtension, ProxyAdmin, RoomConnector, ParkLocation, Limited, Bot, Site, Room, FlexibleUser, Unknown
     */
    public String[] type;

    public ListExtensionsParameters extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ListExtensionsParameters email(String[] email) {
        this.email = email;
        return this;
    }

    public ListExtensionsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListExtensionsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListExtensionsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public ListExtensionsParameters type(String[] type) {
        this.type = type;
        return this;
    }
}
