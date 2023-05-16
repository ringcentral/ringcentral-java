package com.ringcentral.definitions;


public class MessageStoreReport {
    /**
     * Internal identifier of a message store report task
     * Example: 400142200026-400142200026-bd162f24028442489385eb3f44c18354
     */
    public String id;
    /**
     * Canonical URI of a task
     * Format: uri
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
     * The end of the time range to collect message records in ISO 8601 format including timezone
     * Format: date-time
     */
    public String dateTo;
    /**
     * The beginning of the time range to collect call log records in ISO 8601 format including timezone
     * Format: date-time
     */
    public String dateFrom;
    /**
     * The time when this task was started
     * Format: date-time
     */
    public String startTime;
    /**
     * The time when this task was finished
     * Format: date-time
     */
    public String finishTime;
    /**
     * Type of messages to be collected.
     * Example: Fax,VoiceMail
     * Enum: Fax, SMS, VoiceMail, Pager
     */
    public String[] messageTypes;

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

    public MessageStoreReport dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public MessageStoreReport dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public MessageStoreReport startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public MessageStoreReport finishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public MessageStoreReport messageTypes(String[] messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }
}
