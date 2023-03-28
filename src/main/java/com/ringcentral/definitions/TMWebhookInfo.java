package com.ringcentral.definitions;


public class TMWebhookInfo {
    /**
     * Internal identifier of a webhook
     */
    public String id;
    /**
     * Internal identifier of the user who created a webhook
     */
    public String creatorId;
    /**
     * Internal identifiers of groups where a webhook has been created
     */
    public String[] groupIds;
    /**
     * Webhook creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Webhook last update time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Public link to send a webhook payload
     * Format: uri
     */
    public String uri;
    /**
     * Current status of a webhook
     * Enum: Active, Suspended, Deleted
     */
    public String status;

    public TMWebhookInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMWebhookInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public TMWebhookInfo groupIds(String[] groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public TMWebhookInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMWebhookInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public TMWebhookInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public TMWebhookInfo status(String status) {
        this.status = status;
        return this;
    }
}
