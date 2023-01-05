package com.ringcentral.definitions;


public class AccountHistorySearchPublicRequest
{
    /**
     * The beginning of the time range to return records in ISO 8601 format in UTC timezone, default is &quot;eventTimeFrom&quot;-24 hours
     * Format: date-time
     */
    public String eventTimeFrom;
    public AccountHistorySearchPublicRequest eventTimeFrom(String eventTimeFrom)
    {
        this.eventTimeFrom = eventTimeFrom;
        return this;
    }

    /**
     * The end of the time range to return records in ISO 8601 format in UTC timezone, default is the current time
     * Format: date-time
     */
    public String eventTimeTo;
    public AccountHistorySearchPublicRequest eventTimeTo(String eventTimeTo)
    {
        this.eventTimeTo = eventTimeTo;
        return this;
    }

    /**
     * List of extension IDs of change initiators.
     */
    public String[] initiatorIds;
    public AccountHistorySearchPublicRequest initiatorIds(String[] initiatorIds)
    {
        this.initiatorIds = initiatorIds;
        return this;
    }

    /**
     * Page number in the result set
     * Format: int32
     * Example: 1
     */
    public Long page;
    public AccountHistorySearchPublicRequest page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Number of records to be returned per page.
     * Format: int32
     * Example: 25
     */
    public Long perPage;
    public AccountHistorySearchPublicRequest perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * List of extension (user) IDs affected by this action.
     * Example: 404611540004
     */
    public String[] targetIds;
    public AccountHistorySearchPublicRequest targetIds(String[] targetIds)
    {
        this.targetIds = targetIds;
        return this;
    }

    /**
     * Site ID to apply as a filter
     * Example: 871836004
     */
    public String siteId;
    public AccountHistorySearchPublicRequest siteId(String siteId)
    {
        this.siteId = siteId;
        return this;
    }

    /**
     * List of action IDs (exact keys) to search for (alternatively &quot;excludeActionIds&quot; option can be used).
     * Example: CHANGE_SECRET_INFO,CHANGE_USER_INFO
     * Enum: CHANGE_SECRET_INFO, CHANGE_USER_INFO
     */
    public String[] actionIds;
    public AccountHistorySearchPublicRequest actionIds(String[] actionIds)
    {
        this.actionIds = actionIds;
        return this;
    }

    /**
     * The (sub)string to search, applied to the following fields:
    * 
    * - initiator.name
    * - initiator.role
    * - initiator.extensionNumber
    * - target.name
    * - target.extensionNumber
    * - details.parameters.value
     * Example: 542617
     */
    public String searchString;
    public AccountHistorySearchPublicRequest searchString(String searchString)
    {
        this.searchString = searchString;
        return this;
    }

    /**
     * List of action IDs (exact keys) to exclude from your search (alternatively &quot;actionIds&quot; option can be used).
     * Example: CHANGE_SECRET_INFO,CHANGE_USER_INFO
     * Enum: CHANGE_SECRET_INFO, CHANGE_USER_INFO
     */
    public String[] excludeActionIds;
    public AccountHistorySearchPublicRequest excludeActionIds(String[] excludeActionIds)
    {
        this.excludeActionIds = excludeActionIds;
        return this;
    }
}