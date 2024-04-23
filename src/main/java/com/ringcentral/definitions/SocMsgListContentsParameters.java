package com.ringcentral.definitions;


/**
 * Query parameters for operation socMsgListContents
 */
public class SocMsgListContentsParameters {
    /**
     * Filter based on the specified intervention identifiers.
     * Example: 7f946431b6eebffafae642cc,re946431b6eebffafae642cc
     */
    public String[] intervention;
    /**
     * Filter based on the specified identity identifiers.
     * Example: 7f946431b6eebffafae642cc,re946431b6eebffafae642cc
     */
    public String[] identity;
    /**
     * Filter based on the specified identity group identifiers.
     * Example: 7f946431b6eebffafae642cc,re946431b6eebffafae642cc
     */
    public String[] identityGroup;
    /**
     * Filter based on the specified channel identifiers.
     * Example: 7f946431b6eebffafae642cc
     */
    public String[] source;
    /**
     * Filter based on the specified thread identifiers.
     * Example: 7f946431b6eebffafae642cc
     */
    public String[] thread;
    /**
     * Filter based on the specified text(s). Provided multiple times, the values are ANDed.
     */
    public String[] text;
    /**
     * Filter for specified status.
     * Enum: New, Assigned, Replied, UserReply, UserInitiated, Ignored
     */
    public String[] status;
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

    public SocMsgListContentsParameters intervention(String[] intervention) {
        this.intervention = intervention;
        return this;
    }

    public SocMsgListContentsParameters identity(String[] identity) {
        this.identity = identity;
        return this;
    }

    public SocMsgListContentsParameters identityGroup(String[] identityGroup) {
        this.identityGroup = identityGroup;
        return this;
    }

    public SocMsgListContentsParameters source(String[] source) {
        this.source = source;
        return this;
    }

    public SocMsgListContentsParameters thread(String[] thread) {
        this.thread = thread;
        return this;
    }

    public SocMsgListContentsParameters text(String[] text) {
        this.text = text;
        return this;
    }

    public SocMsgListContentsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public SocMsgListContentsParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public SocMsgListContentsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public SocMsgListContentsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
