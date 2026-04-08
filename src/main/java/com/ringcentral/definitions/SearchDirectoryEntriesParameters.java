package com.ringcentral.definitions;

/** Query parameters for operation searchDirectoryEntries */
public class SearchDirectoryEntriesParameters {
    /**
     * Allows to make lookups across a whole directory skipping a filtering logic of Cross-Site
     * access management feature. Default: true
     */
    public Boolean accessibleSitesOnly;

    public SearchDirectoryEntriesParameters accessibleSitesOnly(Boolean accessibleSitesOnly) {
        this.accessibleSitesOnly = accessibleSitesOnly;
        return this;
    }

    /**
     * A list of Account IDs. Deprecated, use the appropriate body field &#039;accountIds&#039;
     * instead.
     */
    public String[] accountId;

    public SearchDirectoryEntriesParameters accountId(String[] accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Department name. Deprecated, use the appropriate body field &#039;department&#039; instead.
     * Example: North office
     */
    public String department;

    public SearchDirectoryEntriesParameters department(String department) {
        this.department = department;
        return this;
    }

    /**
     * A list of Site IDs. Deprecated, use the appropriate body field &#039;siteIds&#039; instead.
     */
    public String[] siteId;

    public SearchDirectoryEntriesParameters siteId(String[] siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * List of extension current statuses. Deprecated, use the appropriate body field
     * &#039;extensionStatuses&#039; instead.
     */
    public String[] extensionStatus;

    public SearchDirectoryEntriesParameters extensionStatus(String[] extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }

    /**
     * Types of extension to filter the contacts Enum: User, Department, Announcement, Voicemail,
     * DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu,
     * ApplicationExtension, ParkLocation, Limited, Bot, Site, Room, ProxyAdmin,
     * DelegatedLinesGroup, FlexibleUser, GroupCallPickup, RoomConnector, TieLine, External
     */
    public String[] extensionType;

    public SearchDirectoryEntriesParameters extensionType(String[] extensionType) {
        this.extensionType = extensionType;
        return this;
    }
}
