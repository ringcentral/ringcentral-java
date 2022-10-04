package com.ringcentral.definitions;


public class SearchDirectoryEntriesRequest {
    /**
     * String value to filter the contacts. The value specified is searched through the following fields: `firstName`, `lastName`, `extensionNumber`, `phoneNumber`, `email`, `jobTitle`, `department`, `customFieldValue`
     */
    public String searchString;
    /**
     * The list of field to be searched for
     * Enum: firstName, lastName, extensionNumber, phoneNumber, email, jobTitle, department, customFieldValue
     */
    public String[] searchFields;
    /**
     * If &#039;True&#039; then contacts of all accounts in federation are returned. If &#039;False&#039; then only contacts of the current account are returned, and account section is eliminated in this case
     * Default: true
     */
    public Boolean showFederated;
    /**
     * Type of extension to filter the contacts
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation, Limited, Site, DelegatedLinesGroup, FlexibleUser
     */
    public String extensionType;
    /**
     * Internal identifier of the business site to which extensions belong
     */
    public String siteId;
    /**
     * The list of Internal identifiers of an accounts
     */
    public String[] accountIds;
    /**
     * Department
     */
    public String department;
    /**
     * The list of Internal identifiers of the business sites to which extensions belong
     */
    public String[] siteIds;
    /**
     * Extension current state.
     * Enum: Enabled, Disabled, NotActivated
     */
    public String[] extensionStatuses;
    /**
     * Types of extension to filter the contacts.
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation, Limited, Site, DelegatedLinesGroup, FlexibleUser
     */
    public String[] extensionTypes;
    /**
     * Sorting settings
     */
    public OrderBy[] orderBy;
    /**
     * Format: int32
     */
    public Long page;
    /**
     * Format: int32
     */
    public Long perPage;

    public SearchDirectoryEntriesRequest searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public SearchDirectoryEntriesRequest searchFields(String[] searchFields) {
        this.searchFields = searchFields;
        return this;
    }

    public SearchDirectoryEntriesRequest showFederated(Boolean showFederated) {
        this.showFederated = showFederated;
        return this;
    }

    public SearchDirectoryEntriesRequest extensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    public SearchDirectoryEntriesRequest siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public SearchDirectoryEntriesRequest accountIds(String[] accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    public SearchDirectoryEntriesRequest department(String department) {
        this.department = department;
        return this;
    }

    public SearchDirectoryEntriesRequest siteIds(String[] siteIds) {
        this.siteIds = siteIds;
        return this;
    }

    public SearchDirectoryEntriesRequest extensionStatuses(String[] extensionStatuses) {
        this.extensionStatuses = extensionStatuses;
        return this;
    }

    public SearchDirectoryEntriesRequest extensionTypes(String[] extensionTypes) {
        this.extensionTypes = extensionTypes;
        return this;
    }

    public SearchDirectoryEntriesRequest orderBy(OrderBy[] orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public SearchDirectoryEntriesRequest page(Long page) {
        this.page = page;
        return this;
    }

    public SearchDirectoryEntriesRequest perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
