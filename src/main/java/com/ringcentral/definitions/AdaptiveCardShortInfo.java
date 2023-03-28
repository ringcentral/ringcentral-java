package com.ringcentral.definitions;


public class AdaptiveCardShortInfo {
    /**
     * Internal identifier of an adaptive card
     */
    public String id;
    /**
     * Adaptive Card creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Post last modification datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Schema of an adaptive card
     */
    public String $schema;
    /**
     * Enum: AdaptiveCard
     */
    public String type;
    /**
     * Version of an adaptive card. Filled on server-side
     */
    public String version;
    /**
     *
     */
    public AdaptiveCardCreator creator;
    /**
     * Chat IDs where an adaptive card is posted or shared.
     */
    public String[] chatIds;

    public AdaptiveCardShortInfo id(String id) {
        this.id = id;
        return this;
    }

    public AdaptiveCardShortInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public AdaptiveCardShortInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public AdaptiveCardShortInfo $schema(String $schema) {
        this.$schema = $schema;
        return this;
    }

    public AdaptiveCardShortInfo type(String type) {
        this.type = type;
        return this;
    }

    public AdaptiveCardShortInfo version(String version) {
        this.version = version;
        return this;
    }

    public AdaptiveCardShortInfo creator(AdaptiveCardCreator creator) {
        this.creator = creator;
        return this;
    }

    public AdaptiveCardShortInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }
}
