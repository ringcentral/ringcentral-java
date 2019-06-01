package com.ringcentral.definitions;


public class MessageStoreReport {
    /**
     * Internal identifier of a message store report task
     */
    public String id;
    /**
     * Link to a task
     */
    public String uri;
    /**
     * Status of a message store report task
     * Enum: Accepted, Pending, InProgress, AttemptFailed, Failed, Completed, Cancelled
     */
    public String status;
    /**
     * Internal identifier of an account
     */
    public String accountId;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Task creation time
     */
    public String creationTime;
    /**
     * Time of the last task modification
     */
    public String lastModifiedTime;
    /**
     * Ending time for collecting messages
     */
    public String dateTo;
    /**
     * Starting time for collecting messages
     */
    public String dateFrom;

    public MessageStoreReport id(String id) {
        this.id = id;
        return this;
    }

    public MessageStoreReport uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MessageStoreReport status(String status) {
        this.status = status;
        return this;
    }

    public MessageStoreReport accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public MessageStoreReport extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public MessageStoreReport creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public MessageStoreReport lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public MessageStoreReport dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public MessageStoreReport dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

}
