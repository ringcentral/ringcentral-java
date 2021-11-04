package com.ringcentral.definitions;


public class GlipAdaptiveCardShortInfo {
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

    public GlipAdaptiveCardShortInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipAdaptiveCardShortInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipAdaptiveCardShortInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipAdaptiveCardShortInfo $schema(String $schema) {
        this.$schema = $schema;
        return this;
    }

    public GlipAdaptiveCardShortInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipAdaptiveCardShortInfo version(String version) {
        this.version = version;
        return this;
    }

    public GlipAdaptiveCardShortInfo creator(AdaptiveCardCreator creator) {
        this.creator = creator;
        return this;
    }

    public GlipAdaptiveCardShortInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }
}
