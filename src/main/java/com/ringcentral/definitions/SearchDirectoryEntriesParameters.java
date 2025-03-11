package com.ringcentral.definitions;


/**
 * Query parameters for operation searchDirectoryEntries
 */
public class SearchDirectoryEntriesParameters {
    /**
     * Allows to make lookups across a whole directory skipping a filtering logic of Cross-Site access management feature.
     * Default: true
     */
    public Boolean accessibleSitesOnly;
    /**
     * A list of Account IDs. Deprecated, use the appropriate body field &#039;accountIds&#039; instead.
     */
    public String[] accountId;
    /**
     * Department name. Deprecated, use the appropriate body field &#039;department&#039; instead.
     * Example: North office
     */
    public String department;
    /**
     * A list of Site IDs. Deprecated, use the appropriate body field &#039;siteIds&#039; instead.
     */
    public String[] siteId;
    /**
     * List of extension current statuses. Deprecated, use the appropriate body field &#039;extensionStatuses&#039; instead.
     */
    public String[] extensionStatus;
    /**
     * Types of extension to filter the contacts
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation, Limited, Bot, Site, Room, ProxyAdmin, DelegatedLinesGroup, FlexibleUser, GroupCallPickup, RoomConnector
     */
    public String[] extensionType;

    public SearchDirectoryEntriesParameters accessibleSitesOnly(Boolean accessibleSitesOnly) {
        this.accessibleSitesOnly = accessibleSitesOnly;
        return this;
    }

    public SearchDirectoryEntriesParameters accountId(String[] accountId) {
        this.accountId = accountId;
        return this;
    }

    public SearchDirectoryEntriesParameters department(String department) {
        this.department = department;
        return this;
    }

    public SearchDirectoryEntriesParameters siteId(String[] siteId) {
        this.siteId = siteId;
        return this;
    }

    public SearchDirectoryEntriesParameters extensionStatus(String[] extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }

    public SearchDirectoryEntriesParameters extensionType(String[] extensionType) {
        this.extensionType = extensionType;
        return this;
    }
}
