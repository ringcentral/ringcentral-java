package com.ringcentral.definitions;


public class AccountHistorySearchPublicRequest {
    /**
     * UTC formatted datetime (RFC3339)
     * <p>
     * 2019-10-12T07:20:50.52Z
     * <p>
     * Default: current time
     * Format: date-time
     */
    public String eventTimeFrom;
    /**
     * UTC formatted datetime (RFC3339)
     * <p>
     * 2019-10-12T07:20:50.52Z
     * <p>
     * Default: dateFrom + 24h
     * Format: date-time
     */
    public String eventTimeTo;
    /**
     * List of extension IDs who is the user of changes.
     */
    public String[] initiatorIds;
    /**
     * Page number of the page you want to jump to.
     * Example: 1
     */
    public Long page;
    /**
     * Number of records returned per page.
     * Example: 25
     */
    public Long perPage;
    /**
     * List of extension IDs (users) affected by this action.
     * Example: 404611540004
     */
    public String[] targetIds;
    /**
     * A filter to apply by site ID
     * Example: 871836004
     */
    public String siteId;
    /**
     * List of action IDs (exact keys) to search for. Or you can use the excludeActionIds option.
     * Example: CHANGE_SECRET_INFO
     * Enum: CHANGE_SECRET_INFO, CHANGE_USER_INFO
     */
    public String[] actionIds;
    /**
     * List of fields to apply search on:
     * <p>
     * initiator.name
     * initiator.role
     * initiator.extensionNumber
     * target.name
     * target.extensionNumber
     * details.parameters.value
     * Example: 542617
     */
    public String searchString;
    /**
     * List of action IDs (exact keys) to exclude from your search. Or you can use the actionIds option.
     * Example: CHANGE_SECRET_INFO
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
