package com.ringcentral.definitions;


    /**
* Query parameters for operation listSocialMessagingIdentities
*/
public class ListSocialMessagingIdentitiesParameters
{
    /**
     * Filter based on the specified `sourceId`
     */
    public String sourceId;
    public ListSocialMessagingIdentitiesParameters sourceId(String sourceId)
    {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Filter based on the specified `identityGroupIds` (separated by commas)
     */
    public String[] identityGroupIds;
    public ListSocialMessagingIdentitiesParameters identityGroupIds(String[] identityGroupIds)
    {
        this.identityGroupIds = identityGroupIds;
        return this;
    }

    /**
     * Filter based on the specified `userId`
     */
    public String userId;
    public ListSocialMessagingIdentitiesParameters userId(String userId)
    {
        this.userId = userId;
        return this;
    }

    /**
     * Filter based on the specified `uuid`
     */
    public String uuid;
    public ListSocialMessagingIdentitiesParameters uuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    /**
     * Ordering by creationTime is descending by default.
     * Example: +creationTime
     * Default: -creationTime
     * Enum: -creationTime, +creationTime, creationTime
     */
    public String orderBy;
    public ListSocialMessagingIdentitiesParameters orderBy(String orderBy)
    {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * The token indicating the particular page of the result set to be retrieved.
    * If omitted the first page will be returned.
     */
    public String pageToken;
    public ListSocialMessagingIdentitiesParameters pageToken(String pageToken)
    {
        this.pageToken = pageToken;
        return this;
    }

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
    public ListSocialMessagingIdentitiesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}