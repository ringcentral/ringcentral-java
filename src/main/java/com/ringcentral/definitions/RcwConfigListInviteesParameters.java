package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwConfigListInvitees
 */
public class RcwConfigListInviteesParameters {
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    /**
     * The token indicating the particular page of the result set to be retrieved.
     * If omitted the first page will be returned.
     */
    public String pageToken;

    public RcwConfigListInviteesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwConfigListInviteesParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}
