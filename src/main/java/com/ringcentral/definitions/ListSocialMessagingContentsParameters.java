package com.ringcentral.definitions;


/**
 * Query parameters for operation listSocialMessagingContents
 */
public class ListSocialMessagingContentsParameters {
    /**
     * Filter based on the specified intervention identifiers
     * Example: 7f946431b6eebffafae642cc,re946431b6eebffafae642cc
     */
    public String[] interventionIds;
    /**
     * Filter based on the specified identity identifiers
     * Example: 7f946431b6eebffafae642cc,re946431b6eebffafae642cc
     */
    public String[] authorIdentityIds;
    /**
     * Filter based on the specified identity group identifiers
     * Example: 7f946431b6eebffafae642cc,re946431b6eebffafae642cc
     */
    public String[] authorIdentityGroupIds;
    /**
     * Filter based on the specified channel identifiers
     * Example: 7f946431b6eebffafae642cc
     */
    public String[] channelIds;
    /**
     * Direction of the content.
     * <p>
     * * Incoming contents are received from a channel.
     * * Outgoing contents are exported to a channel.
     * Example: Incoming
     * Enum: Incoming, Outgoing
     */
    public String contentDirection;
    /**
     * Filter based on the specified thread identifiers
     * Example: 7f946431b6eebffafae642cc
     */
    public String[] threadIds;
    /**
     * Filter based on the specified text(s). Provided multiple times, the values are ANDed
     */
    public String[] text;
    /**
     * Filter for specified status
     * Enum: New, Assigned, Replied, UserReply, UserInitiated, Ignored
     */
    public String[] status;
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

    public ListSocialMessagingContentsParameters interventionIds(String[] interventionIds) {
        this.interventionIds = interventionIds;
        return this;
    }

    public ListSocialMessagingContentsParameters authorIdentityIds(String[] authorIdentityIds) {
        this.authorIdentityIds = authorIdentityIds;
        return this;
    }

    public ListSocialMessagingContentsParameters authorIdentityGroupIds(String[] authorIdentityGroupIds) {
        this.authorIdentityGroupIds = authorIdentityGroupIds;
        return this;
    }

    public ListSocialMessagingContentsParameters channelIds(String[] channelIds) {
        this.channelIds = channelIds;
        return this;
    }

    public ListSocialMessagingContentsParameters contentDirection(String contentDirection) {
        this.contentDirection = contentDirection;
        return this;
    }

    public ListSocialMessagingContentsParameters threadIds(String[] threadIds) {
        this.threadIds = threadIds;
        return this;
    }

    public ListSocialMessagingContentsParameters text(String[] text) {
        this.text = text;
        return this;
    }

    public ListSocialMessagingContentsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public ListSocialMessagingContentsParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ListSocialMessagingContentsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListSocialMessagingContentsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
