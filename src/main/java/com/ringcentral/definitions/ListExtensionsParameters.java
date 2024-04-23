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
     * Example: alice.smith@example.com&amp;email=bob.johnson@example.com
     */
    public String email;
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
     * Extension current state. Multiple values are supported. If &#039;Unassigned&#039;
     * is specified, then extensions without `extensionNumber` attribute are returned.
     * If not specified, then all extensions are returned
     * Enum: Enabled, Disabled, NotActivated, Unassigned
     */
    public String[] status;
    /**
     * Extension type. Multiple values are supported. Please note
     * that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039;
     * extensions in modern RingCentral product terminology
     * Enum: User, FaxUser, FlexibleUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Limited, Bot, ProxyAdmin, DelegatedLinesGroup, Site
     */
    public String[] type;

    public ListExtensionsParameters extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ListExtensionsParameters email(String email) {
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
