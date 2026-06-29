package com.ringcentral.definitions;

/** Query parameters for operation mthListThreads */
public class MthListThreadsParameters {
    /** Thread status Enum: Open, Resolved */
    public String threadStatus;

    public MthListThreadsParameters threadStatus(String threadStatus) {
        this.threadStatus = threadStatus;
        return this;
    }

    /** Thread owner extension IDs */
    public String[] ownerExtensionIds;

    public MthListThreadsParameters ownerExtensionIds(String[] ownerExtensionIds) {
        this.ownerExtensionIds = ownerExtensionIds;
        return this;
    }

    /**
     * Start date/time for resulting message threads or messages (depending on path resource) in
     * [RFC-3339](https://datatracker.ietf.org/doc/html/rfc3339) format including timezone. This
     * parameter is supported if `creationTimeTo` is specified
     */
    public String creationTimeFrom;

    public MthListThreadsParameters creationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }

    /**
     * End date/time for resulting message threads or messages (depending on path resource) in
     * [RFC-3339](https://datatracker.ietf.org/doc/html/rfc3339) format including timezone. This
     * parameter is supported if `creationTimeFrom` is specified
     */
    public String creationTimeTo;

    public MthListThreadsParameters creationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }

    /** Phone number in e.164 format (with &#039;+&#039; prefix) Example: +16501234567 */
    public String ownerPhoneNumber;

    public MthListThreadsParameters ownerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
        return this;
    }

    /** Phone number in e.164 format (with &#039;+&#039; prefix) Example: +16501234567 */
    public String guestPhoneNumber;

    public MthListThreadsParameters guestPhoneNumber(String guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
        return this;
    }

    /**
     * Availability filter (by default only `Alive` records are returned) Default: Alive Enum:
     * Alive, Deleted
     */
    public String[] availability;

    public MthListThreadsParameters availability(String[] availability) {
        this.availability = availability;
        return this;
    }

    /**
     * The number of items per page. If the provided value in the request is greater than a maximum,
     * the maximum value is applied Maximum: 1000 Minimum: 1 Format: int32 Example: 100 Default: 100
     */
    public Long perPage;

    public MthListThreadsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * The result set page number (1-indexed) to return Maximum: 1000 Minimum: 1 Format: int32
     * Example: 1 Default: 1
     */
    public Long page;

    public MthListThreadsParameters page(Long page) {
        this.page = page;
        return this;
    }
}
