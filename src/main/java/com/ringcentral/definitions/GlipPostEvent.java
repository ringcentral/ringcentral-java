package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipPostEvent
{
    // Internal identifier of a post
    public String id;
    public GlipPostEvent id(String id) {
        this.id = id;
        return this;
    }
    // Type of a post event
    public String eventType;
    public GlipPostEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    // Internal identifier of a group a post belongs to
    public String groupId;
    public GlipPostEvent groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    // Type of a post. 'TextMessage' - an incoming text message; 'PersonJoined' - a message notifying that person has joined a conversation; 'PersonsAdded' - a message notifying that a person(s) were added to a conversation
    public String type;
    public GlipPostEvent type(String type) {
        this.type = type;
        return this;
    }
    // For 'TextMessage' post type only. Message text
    public String text;
    public GlipPostEvent text(String text) {
        this.text = text;
        return this;
    }
    // Internal identifier of a user - author of a post
    public String creatorId;
    public GlipPostEvent creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    // For PersonsAdded post type only. Identifiers of persons added to a group
    public String[] addedPersonIds;
    public GlipPostEvent addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }
    // For PersonsRemoved post type only. Identifiers of persons removed from a group
    public String[] removedPersonIds;
    public GlipPostEvent removedPersonIds(String[] removedPersonIds) {
        this.removedPersonIds = removedPersonIds;
        return this;
    }
    // Post creation datetime in ISO 8601 format
    public String creationTime;
    public GlipPostEvent creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Post last change datetime in ISO 8601 format
    public String lastModifiedTime;
    public GlipPostEvent lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
