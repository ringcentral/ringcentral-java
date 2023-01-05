package com.ringcentral.definitions;


    /**
* Query parameters for operation searchDirectoryEntries
*/
public class SearchDirectoryEntriesParameters
{
    /**
     * A list of Account IDs
     * Example: 400131426008
     */
    public String accountId;
    public SearchDirectoryEntriesParameters accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * A list of department names
     * Example: North office
     */
    public String department;
    public SearchDirectoryEntriesParameters department(String department)
    {
        this.department = department;
        return this;
    }

    /**
     * A list of Site IDs
     * Example: 872781797006
     */
    public String siteId;
    public SearchDirectoryEntriesParameters siteId(String siteId)
    {
        this.siteId = siteId;
        return this;
    }

    /**
     * Extension current state
     * Example: Enabled
     */
    public String extensionStatus;
    public SearchDirectoryEntriesParameters extensionStatus(String extensionStatus)
    {
        this.extensionStatus = extensionStatus;
        return this;
    }

    /**
     * Extension types
     * Example: User
     */
    public String extensionType;
    public SearchDirectoryEntriesParameters extensionType(String extensionType)
    {
        this.extensionType = extensionType;
        return this;
    }
}