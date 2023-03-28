package com.ringcentral.definitions;


/**
 * Query parameters for operation listDirectoryEntries
 */
public class ListDirectoryEntriesParameters {
    /**
     * If &#039;True&#039; then contacts of all accounts in federation are returned. If &#039;False&#039; then only contacts of the current account are returned, and account section is eliminated in this case
     * Default: true
     */
    public Boolean showFederated;
    /**
     * Type of an extension. Please note that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039; extensions in modern RingCentral product terminology
     * Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ParkLocation, Limited, External
     */
    public String type;
    /**
     * Page number
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Records count to be returned per one page. The default value is 1000. Specific keyword values: `all` - all records are returned in one page; `max` - maximum count of records that can be returned in one page
     * Maximum: 2000
     * Format: int32
     * Default: 1000
     */
    public Long perPage;
    /**
     * Internal identifier of the business site to which extensions belong
     */
    public String siteId;

    public ListDirectoryEntriesParameters showFederated(Boolean showFederated) {
        this.showFederated = showFederated;
        return this;
    }

    public ListDirectoryEntriesParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListDirectoryEntriesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListDirectoryEntriesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListDirectoryEntriesParameters siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
}
