package com.ringcentral.definitions;


public class TMPostInfo {
    /**
     * Internal identifier of a post
     */
    public String id;
    /**
     * Internal identifier of a group a post belongs to
     */
    public String groupId;
    /**
     * Type of a post
     * Enum: TextMessage, PersonJoined, PersonsAdded
     */
    public String type;
    /**
     * For &#039;TextMessage&#039; post type only. Text of a message
     */
    public String text;
    /**
     * Internal identifier of a user - author of a post
     */
    public String creatorId;
    /**
     * For &#039;PersonsAdded&#039; post type only. Identifiers of persons added to a group
     */
    public String[] addedPersonIds;
    /**
     * Post creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Post last modification datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * List of posted attachments
     */
    public TMMessageAttachmentInfo[] attachments;
    /**
     *
     */
    public TMMentionsInfo[] mentions;
    /**
     * Label of activity type
     */
    public String activity;
    /**
     * Title of a message. (Can be set for bot&#039;s messages only)
     */
    public String title;
    /**
     * Link to an image used as an icon for this message
     * Format: uri
     */
    public String iconUri;
    /**
     * Emoji used as an icon for this message
     */
    public String iconEmoji;

    public TMPostInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMPostInfo groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public TMPostInfo type(String type) {
        this.type = type;
        return this;
    }

    public TMPostInfo text(String text) {
        this.text = text;
        return this;
    }

    public TMPostInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public TMPostInfo addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }

    public TMPostInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMPostInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public TMPostInfo attachments(TMMessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public TMPostInfo mentions(TMMentionsInfo[] mentions) {
        this.mentions = mentions;
        return this;
    }

    public TMPostInfo activity(String activity) {
        this.activity = activity;
        return this;
    }

    public TMPostInfo title(String title) {
        this.title = title;
        return this;
    }

    public TMPostInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }

    public TMPostInfo iconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
        return this;
    }
}
