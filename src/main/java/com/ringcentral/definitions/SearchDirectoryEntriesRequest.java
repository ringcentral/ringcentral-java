package com.ringcentral.definitions;


public class SearchDirectoryEntriesRequest {
    /**
     * String value to filter the contacts. The value specified is searched through the following fields: `firstName`, `lastName`, `extensionNumber`, `phoneNumber`, `email`, `jobTitle`, `department`
     */
    public String searchString;
    /**
     * Enum: firstName, lastName, extensionNumber, phoneNumber, email, jobTitle, department
     */
    public String[] searchFields;
    /**
     * If &#039;True&#039; then contacts of all accounts in federation are returned. If &#039;False&#039; then only contacts of the current account are returned, and account section is eliminated in this case
     * Default: true
     */
    public Boolean showFederated;
    /**
     * Type of extension to filter the contacts. Please note that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039; extensions in modern RingCentral product terminology
     * Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, IvrMenu, Limited, ApplicationExtension, Site, Bot, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup, Room
     */
    public String extensionType;
    /**
     * Sorting settings
     */
    public OrderBy[] orderBy;
    /**
     *
     */
    public Long page;
    /**
     *
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
