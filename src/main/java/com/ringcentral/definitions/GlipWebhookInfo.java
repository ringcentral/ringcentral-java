package com.ringcentral.definitions;


public class GlipWebhookInfo {
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
    public String[] groupsId;
    /**
     * Webhook creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;
    /**
     * Webhook last update time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;
    /**
     * Public link to send a webhook payload
     */
    public String uri;
    /**
     * Current status of a webhook
     * Enum: Active, Suspended, Deleted
     */
    public String status;

    public GlipWebhookInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipWebhookInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public GlipWebhookInfo groupsId(String[] groupsId) {
        this.groupsId = groupsId;
        return this;
    }

    public GlipWebhookInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipWebhookInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipWebhookInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GlipWebhookInfo status(String status) {
        this.status = status;
        return this;
    }

}
