package com.ringcentral.definitions;


/**
 * Query parameters for operation searchDirectoryEntries
 */
public class SearchDirectoryEntriesParameters {
    /**
     * A list of Account IDs
     */
    public String accountId;
    /**
     * A list of department names
     */
    public String department;
    /**
     * A list of Site IDs
     */
    public String siteId;
    /**
     * Extension current state
     */
    public String extensionStatus;
    /**
     * Extension types
     */
    public String extensionType;

    public SearchDirectoryEntriesParameters accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public SearchDirectoryEntriesParameters department(String department) {
        this.department = department;
        return this;
    }

    public SearchDirectoryEntriesParameters siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public SearchDirectoryEntriesParameters extensionStatus(String extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }

    public SearchDirectoryEntriesParameters extensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }
}
