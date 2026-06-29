package com.ringcentral.definitions;

public class TMPostInfo {
    /** Internal identifier of a post */
    public String id;

    public TMPostInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a group a post belongs to */
    public String groupId;

    public TMPostInfo groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Boolean flag indicating that current post is a parent post of a thread. Populated only for
     * parent posts
     */
    public Boolean isParent;

    public TMPostInfo isParent(Boolean isParent) {
        this.isParent = isParent;
        return this;
    }

    /** Internal identifier of a parent post, in case post is a part of a thread */
    public String parentPostId;

    public TMPostInfo parentPostId(String parentPostId) {
        this.parentPostId = parentPostId;
        return this;
    }

    /** Internal identifier of a thread, in case post is a part of a thread */
    public String threadId;

    public TMPostInfo threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Type of post Enum: TextMessage, PersonJoined, PersonsAdded */
    public String type;

    public TMPostInfo type(String type) {
        this.type = type;
        return this;
    }

    /** For &#039;TextMessage&#039; post type only. Text of a message */
    public String text;

    public TMPostInfo text(String text) {
        this.text = text;
        return this;
    }

    /** Internal identifier of a user - author of a post */
    public String creatorId;

    public TMPostInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /** For &#039;PersonsAdded&#039; post type only. Identifiers of persons added to a group */
    public String[] addedPersonIds;

    public TMPostInfo addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }

    /**
     * Post creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format Format:
     * date-time
     */
    public String creationTime;

    public TMPostInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Post last modification datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;

    public TMPostInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** List of posted attachments */
    public TMMessageAttachmentInfo[] attachments;

    public TMPostInfo attachments(TMMessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    /** */
    public TMMentionsInfo[] mentions;

    public TMPostInfo mentions(TMMentionsInfo[] mentions) {
        this.mentions = mentions;
        return this;
    }

    /** Label of activity type */
    public String activity;

    public TMPostInfo activity(String activity) {
        this.activity = activity;
        return this;
    }

    /** Title of a message. (Can be set for bot&#039;s messages only) */
    public String title;

    public TMPostInfo title(String title) {
        this.title = title;
        return this;
    }

    /** Link to an image used as an icon for this message Format: uri */
    public String iconUri;

    public TMPostInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }

    /** Emoji used as an icon for this message */
    public String iconEmoji;

    public TMPostInfo iconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
        return this;
    }
}
