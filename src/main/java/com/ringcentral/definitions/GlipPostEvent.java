package com.ringcentral.definitions;


public class GlipPostEvent {
    /**
     * Internal identifier of a post
     */
    public String id;
    /**
     * Type of a post event
     * Enum: PostAdded, PostChanged, PostRemoved
     */
    public String eventType;
    /**
     * Internal identifier of a group a post belongs to
     */
    public String groupId;
    /**
     * Type of a post. 'TextMessage' - an incoming text message; 'PersonJoined' - a message notifying that person has joined a conversation; 'PersonsAdded' - a message notifying that a person(s) were added to a conversation
     * Enum: TextMessage, PersonJoined, PersonsAdded, Card
     */
    public String type;
    /**
     * For 'TextMessage' post type only. Message text
     */
    public String text;
    /**
     * Internal identifier of a user - author of a post
     */
    public String creatorId;
    /**
     * For PersonsAdded post type only. Identifiers of persons added to a group
     */
    public String[] addedPersonIds;
    /**
     * For PersonsRemoved post type only. Identifiers of persons removed from a group
     */
    public String[] removedPersonIds;
    /**
     * List of at mentions in post text with names.
     */
    public GlipMentionsInfo[] mentions;
    /**
     * Post creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;
    /**
     * Post last change datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;

    public GlipPostEvent id(String id) {
        this.id = id;
        return this;
    }

    public GlipPostEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public GlipPostEvent groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public GlipPostEvent type(String type) {
        this.type = type;
        return this;
    }

    public GlipPostEvent text(String text) {
        this.text = text;
        return this;
    }

    public GlipPostEvent creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public GlipPostEvent addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }

    public GlipPostEvent removedPersonIds(String[] removedPersonIds) {
        this.removedPersonIds = removedPersonIds;
        return this;
    }

    public GlipPostEvent mentions(GlipMentionsInfo[] mentions) {
        this.mentions = mentions;
        return this;
    }

    public GlipPostEvent creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipPostEvent lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}
