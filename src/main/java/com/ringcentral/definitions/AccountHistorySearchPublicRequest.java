package com.ringcentral.definitions;


public class AccountHistorySearchPublicRequest {
    /**
     * The beginning of the time range to return records in ISO 8601 format in UTC timezone, default is &quot;eventTimeFrom&quot;-24 hours
     * Format: date-time
     */
    public String eventTimeFrom;
    /**
     * The end of the time range to return records in ISO 8601 format in UTC timezone, default is the current time
     * Format: date-time
     */
    public String eventTimeTo;
    /**
     * List of extension IDs of change initiators.
     */
    public String[] initiatorIds;
    /**
     * Page number in the result set
     * Format: int32
     * Example: 1
     */
    public Long page;
    /**
     * Number of records to be returned per page.
     * Format: int32
     * Example: 25
     */
    public Long perPage;
    /**
     * List of extension (user) IDs affected by this action.
     * Example: 404611540004
     */
    public String[] targetIds;
    /**
     * Site ID to apply as a filter
     * Example: 871836004
     */
    public String siteId;
    /**
     * List of action IDs (exact keys) to search for (alternatively &quot;excludeActionIds&quot; option can be used).
     * Example: CHANGE_SECRET_INFO,CHANGE_USER_INFO
     * Enum: CHANGE_SECRET_INFO, CHANGE_USER_INFO
     */
    public String[] actionIds;
    /**
     * The (sub)string to search, applied to the following fields:
     * <p>
     * - initiator.name
     * - initiator.role
     * - initiator.extensionNumber
     * - target.name
     * - target.extensionNumber
     * - details.parameters.value
     * Example: 542617
     */
    public String searchString;
    /**
     * List of action IDs (exact keys) to exclude from your search (alternatively &quot;actionIds&quot; option can be used).
     * Example: CHANGE_SECRET_INFO,CHANGE_USER_INFO
     * Enum: CHANGE_SECRET_INFO, CHANGE_USER_INFO
     */
    public String[] excludeActionIds;

    public AccountHistorySearchPublicRequest eventTimeFrom(String eventTimeFrom) {
        this.eventTimeFrom = eventTimeFrom;
        return this;
    }

    public AccountHistorySearchPublicRequest eventTimeTo(String eventTimeTo) {
        this.eventTimeTo = eventTimeTo;
        return this;
    }

    public AccountHistorySearchPublicRequest initiatorIds(String[] initiatorIds) {
        this.initiatorIds = initiatorIds;
        return this;
    }

    public AccountHistorySearchPublicRequest page(Long page) {
        this.page = page;
        return this;
    }

    public AccountHistorySearchPublicRequest perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public AccountHistorySearchPublicRequest targetIds(String[] targetIds) {
        this.targetIds = targetIds;
        return this;
    }

    public AccountHistorySearchPublicRequest siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public AccountHistorySearchPublicRequest actionIds(String[] actionIds) {
        this.actionIds = actionIds;
        return this;
    }

    public AccountHistorySearchPublicRequest searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public AccountHistorySearchPublicRequest excludeActionIds(String[] excludeActionIds) {
        this.excludeActionIds = excludeActionIds;
        return this;
    }
}
