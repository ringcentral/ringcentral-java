package com.ringcentral.definitions;


/**
 * Query parameters for operation listExtensionGrants
 */
public class ListExtensionGrantsParameters {
    /**
     * Type of extension to be returned. Multiple values are supported.
     * **Please note that legacy &#039;Department&#039; extension type corresponds
     * to &#039;Call Queue&#039; extensions in modern RingCentral product terminology**
     * Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Limited, Bot, Room, DelegatedLinesGroup
     */
    public String[] extensionType;
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

    public ListExtensionGrantsParameters extensionType(String[] extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    public ListExtensionGrantsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListExtensionGrantsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
