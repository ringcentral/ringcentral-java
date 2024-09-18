package com.ringcentral.definitions;


/**
 * Query parameters for operation listSocialMessagingIdentities
 */
public class ListSocialMessagingIdentitiesParameters {
    /**
     * Filter based on the specified channelId.
     */
    public String channelId;
    /**
     * Filter based on the specified `identityGroupIds` (separated by commas)
     */
    public String[] identityGroupIds;
    /**
     * Either Agent or Customer
     * Enum: Agent, Customer
     */
    public String identityType;
    /**
     * Filter based on the specified `userId`
     */
    public String userId;
    /**
     * Filter based on the specified `uuid`
     */
    public String uuid;
    /**
     * Ordering by creationTime and lastModifiedTime is descending by default.
     * Example: +creationTime
     * Default: -creationTime
     * Enum: -creationTime, +creationTime, creationTime, -lastModifiedTime, +lastModifiedTime, lastModifiedTime
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

    public ListSocialMessagingIdentitiesParameters channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public ListSocialMessagingIdentitiesParameters identityGroupIds(String[] identityGroupIds) {
        this.identityGroupIds = identityGroupIds;
        return this;
    }

    public ListSocialMessagingIdentitiesParameters identityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    public ListSocialMessagingIdentitiesParameters userId(String userId) {
        this.userId = userId;
        return this;
    }

    public ListSocialMessagingIdentitiesParameters uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public ListSocialMessagingIdentitiesParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ListSocialMessagingIdentitiesParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListSocialMessagingIdentitiesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
