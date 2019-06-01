package com.ringcentral.definitions;


public class GlipPostInfo {
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
     * For 'TextMessage' post type only. Text of a message
     */
    public String text;
    /**
     * Internal identifier of a user - author of a post
     */
    public String creatorId;
    /**
     * For 'PersonsAdded' post type only. Identifiers of persons added to a group
     */
    public String[] addedPersonIds;
    /**
     * Post creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;
    /**
     * Post last modification datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;
    /**
     * List of posted attachments
     */
    public GlipMessageAttachmentInfo[] attachments;
    /**
     *
     */
    public GlipMentionsInfo[] mentions;
    /**
     * Label of activity type
     */
    public String activity;
    /**
     * Title of a message. (Can be set for bot's messages only)
     */
    public String title;
    /**
     * Link to an image used as an icon for this message
     */
    public String iconUri;
    /**
     * Emoji used as an icon for this message
     */
    public String iconEmoji;

    public GlipPostInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipPostInfo groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public GlipPostInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipPostInfo text(String text) {
        this.text = text;
        return this;
    }

    public GlipPostInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public GlipPostInfo addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }

    public GlipPostInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipPostInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipPostInfo attachments(GlipMessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public GlipPostInfo mentions(GlipMentionsInfo[] mentions) {
        this.mentions = mentions;
        return this;
    }

    public GlipPostInfo activity(String activity) {
        this.activity = activity;
        return this;
    }

    public GlipPostInfo title(String title) {
        this.title = title;
        return this;
    }

    public GlipPostInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }

    public GlipPostInfo iconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
        return this;
    }

}
