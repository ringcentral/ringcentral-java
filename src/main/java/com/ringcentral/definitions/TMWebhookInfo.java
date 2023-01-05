package com.ringcentral.definitions;


public class TMWebhookInfo
{
    /**
     * Internal identifier of a webhook
     */
    public String id;
    public TMWebhookInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Internal identifier of the user who created a webhook
     */
    public String creatorId;
    public TMWebhookInfo creatorId(String creatorId)
    {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * Internal identifiers of groups where a webhook has been created
     */
    public String[] groupIds;
    public TMWebhookInfo groupIds(String[] groupIds)
    {
        this.groupIds = groupIds;
        return this;
    }

    /**
     * Webhook creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    public TMWebhookInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Webhook last update time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMWebhookInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Public link to send a webhook payload
     * Format: uri
     */
    public String uri;
    public TMWebhookInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Current status of a webhook
     * Enum: Active, Suspended, Deleted
     */
    public String status;
    public TMWebhookInfo status(String status)
    {
        this.status = status;
        return this;
    }
}