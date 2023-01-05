package com.ringcentral.definitions;


public class SearchDirectoryEntriesRequest
{
    /**
     * String value to filter the contacts. The value specified is searched through the following fields: `firstName`, `lastName`, `extensionNumber`, `phoneNumber`, `email`, `jobTitle`, `department`, `customFieldValue`
     */
    public String searchString;
    public SearchDirectoryEntriesRequest searchString(String searchString)
    {
        this.searchString = searchString;
        return this;
    }

    /**
     * The list of field to be searched for
     * Enum: firstName, lastName, extensionNumber, phoneNumber, email, jobTitle, department, customFieldValue
     */
    public String[] searchFields;
    public SearchDirectoryEntriesRequest searchFields(String[] searchFields)
    {
        this.searchFields = searchFields;
        return this;
    }

    /**
     * If &#039;True&#039; then contacts of all accounts in federation are returned, if it is in federation, account section will be returned. If &#039;False&#039; then only contacts of the current account are returned, and account section is eliminated in this case
     */
    public Boolean showFederated;
    public SearchDirectoryEntriesRequest showFederated(Boolean showFederated)
    {
        this.showFederated = showFederated;
        return this;
    }

    /**
     * Should show AdminOnly Contacts
     */
    public Boolean showAdminOnlyContacts;
    public SearchDirectoryEntriesRequest showAdminOnlyContacts(Boolean showAdminOnlyContacts)
    {
        this.showAdminOnlyContacts = showAdminOnlyContacts;
        return this;
    }

    /**
     * Type of extension to filter the contacts
     * Example: FaxUser
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation, Limited, Site, DelegatedLinesGroup, FlexibleUser
     */
    public String extensionType;
    public SearchDirectoryEntriesRequest extensionType(String extensionType)
    {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Internal identifier of the business site to which extensions belong
     * Example: 872781797006
     */
    public String siteId;
    public SearchDirectoryEntriesRequest siteId(String siteId)
    {
        this.siteId = siteId;
        return this;
    }

    /**
     * Allows to control whether External (Hybrid) contacts should be returned in the response or not
     * Example: true
     */
    public Boolean showExternalContacts;
    public SearchDirectoryEntriesRequest showExternalContacts(Boolean showExternalContacts)
    {
        this.showExternalContacts = showExternalContacts;
        return this;
    }

    /**
     * The list of Internal identifiers of an accounts
     * Example: 854874047006,422456828004,854874151006
     */
    public String[] accountIds;
    public SearchDirectoryEntriesRequest accountIds(String[] accountIds)
    {
        this.accountIds = accountIds;
        return this;
    }

    /**
     * Department
     */
    public String department;
    public SearchDirectoryEntriesRequest department(String department)
    {
        this.department = department;
        return this;
    }

    /**
     * The list of Internal identifiers of the business sites to which extensions belong
     */
    public String[] siteIds;
    public SearchDirectoryEntriesRequest siteIds(String[] siteIds)
    {
        this.siteIds = siteIds;
        return this;
    }

    /**
     * Extension current state.
     * Enum: Enabled, Disabled, NotActivated
     */
    public String[] extensionStatuses;
    public SearchDirectoryEntriesRequest extensionStatuses(String[] extensionStatuses)
    {
        this.extensionStatuses = extensionStatuses;
        return this;
    }

    /**
     * Types of extension to filter the contacts.
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation, Limited, Site, DelegatedLinesGroup, FlexibleUser
     */
    public String[] extensionTypes;
    public SearchDirectoryEntriesRequest extensionTypes(String[] extensionTypes)
    {
        this.extensionTypes = extensionTypes;
        return this;
    }

    /**
     * Sorting settings
     */
    public OrderBy[] orderBy;
    public SearchDirectoryEntriesRequest orderBy(OrderBy[] orderBy)
    {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Format: int32
     */
    public Long page;
    public SearchDirectoryEntriesRequest page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Format: int32
     */
    public Long perPage;
    public SearchDirectoryEntriesRequest perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}