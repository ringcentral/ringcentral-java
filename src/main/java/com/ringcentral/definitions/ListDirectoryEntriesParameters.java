package com.ringcentral.definitions;


/**
 * Query parameters for operation listDirectoryEntries
 */
public class ListDirectoryEntriesParameters {
    /**
     * Allows to make lookups across a whole directory skipping a filtering logic of Cross-Site access management feature.
     * Default: true
     */
    public Boolean accessibleSitesOnly;
    /**
     * If `true` then contacts of all accounts in federation are returned. If `false` then only contacts of the current account are returned, and account section is eliminated in this case
     * Default: true
     */
    public Boolean showFederated;
    /**
     * Type of an extension. Please note that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039; extensions in modern RingCentral product terminology
     * Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ParkLocation, Limited, External
     */
    public String type;
    /**
     * Type of extension group
     * Enum: User, NonUser
     */
    public String typeGroup;
    /**
     * Page number
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Records count to be returned per one page. It can be either integer or string with the specific keyword values:
     * - `all` - all records are returned in one page
     * - `max` - maximum count of records that can be returned in one page
     * Maximum: 2000
     * Format: int32
     * Default: 1000
     * Enum: max, all
     */
    public String perPage;
    /**
     * Internal identifier of the business site to which extensions belong
     */
    public String siteId;

    public ListDirectoryEntriesParameters accessibleSitesOnly(Boolean accessibleSitesOnly) {
        this.accessibleSitesOnly = accessibleSitesOnly;
        return this;
    }

    public ListDirectoryEntriesParameters showFederated(Boolean showFederated) {
        this.showFederated = showFederated;
        return this;
    }

    public ListDirectoryEntriesParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListDirectoryEntriesParameters typeGroup(String typeGroup) {
        this.typeGroup = typeGroup;
        return this;
    }

    public ListDirectoryEntriesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListDirectoryEntriesParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListDirectoryEntriesParameters siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
}
