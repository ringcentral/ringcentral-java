package com.ringcentral.definitions;

/** Query parameters for operation mthListMessages */
public class MthListMessagesParameters {
    /** Thread status Enum: Open, Resolved */
    public String threadStatus;

    public MthListMessagesParameters threadStatus(String threadStatus) {
        this.threadStatus = threadStatus;
        return this;
    }

    /** Thread owner extension IDs */
    public String[] ownerExtensionIds;

    public MthListMessagesParameters ownerExtensionIds(String[] ownerExtensionIds) {
        this.ownerExtensionIds = ownerExtensionIds;
        return this;
    }

    /**
     * Availability filter (by default only `Alive` records are returned) Default: Alive Enum:
     * Alive, Deleted
     */
    public String[] availability;

    public MthListMessagesParameters availability(String[] availability) {
        this.availability = availability;
        return this;
    }

    /** Message IDs to filter the list of results */
    public String[] messageIds;

    public MthListMessagesParameters messageIds(String[] messageIds) {
        this.messageIds = messageIds;
        return this;
    }

    /** Thread ID(s) to filter messages */
    public String[] threadIds;

    public MthListMessagesParameters threadIds(String[] threadIds) {
        this.threadIds = threadIds;
        return this;
    }

    /**
     * Start date/time for resulting message threads or messages (depending on path resource) in
     * [RFC-3339](https://datatracker.ietf.org/doc/html/rfc3339) format including timezone. This
     * parameter is supported if `creationTimeTo` is specified
     */
    public String creationTimeFrom;

    public MthListMessagesParameters creationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }

    /**
     * End date/time for resulting message threads or messages (depending on path resource) in
     * [RFC-3339](https://datatracker.ietf.org/doc/html/rfc3339) format including timezone. This
     * parameter is supported if `creationTimeFrom` is specified
     */
    public String creationTimeTo;

    public MthListMessagesParameters creationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }

    /**
     * The number of items per page. If the provided value in the request is greater than a maximum,
     * the maximum value is applied Maximum: 1000 Minimum: 1 Format: int32 Example: 100 Default: 100
     */
    public Long perPage;

    public MthListMessagesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * The result set page number (1-indexed) to return Maximum: 1000 Minimum: 1 Format: int32
     * Example: 1 Default: 1
     */
    public Long page;

    public MthListMessagesParameters page(Long page) {
        this.page = page;
        return this;
    }
}
