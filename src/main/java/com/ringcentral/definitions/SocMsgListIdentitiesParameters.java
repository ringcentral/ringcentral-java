package com.ringcentral.definitions;


/**
 * Query parameters for operation socMsgListIdentities
 */
public class SocMsgListIdentitiesParameters {
    /**
     * Filter based on the specified sourceId.
     */
    public String sourceId;
    /**
     * Filter based on the specified identityGroupIds (separated by commas).
     */
    public String[] identityGroupIds;
    /**
     * Filter based on the specified userId.
     */
    public String userId;
    /**
     * Filter based on the specified uuid.
     */
    public String uuid;
    /**
     * Ordering by creationTime is descending by default.
     * Example: +creationTime
     * Default: -creationTime
     * Enum: -creationTime, +creationTime, creationTime
     */
    public String orderBy;
    /**
     * The token indicating the particular page of the result set to be retrieved.
     * If omitted the first page will be returned.
     */
    public String pageToken;
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

    public SocMsgListIdentitiesParameters sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public SocMsgListIdentitiesParameters identityGroupIds(String[] identityGroupIds) {
        this.identityGroupIds = identityGroupIds;
        return this;
    }

    public SocMsgListIdentitiesParameters userId(String userId) {
        this.userId = userId;
        return this;
    }

    public SocMsgListIdentitiesParameters uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public SocMsgListIdentitiesParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public SocMsgListIdentitiesParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public SocMsgListIdentitiesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
