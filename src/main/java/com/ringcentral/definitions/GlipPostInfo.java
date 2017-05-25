package com.ringcentral.definitions;

public class GlipPostInfo {
    // Internal identifier of a post
    public String id;
    // Internal identifier of a group a post belongs to
    public String groupId;
    // Type of a post
    public String type;
    // For 'TextMessage' post type only. Message text
    public String text;
    // Internal identifier of a user - author of a post
    public String creatorId;
    // For PersonsAdded post type only. Identifiers of persons added to a group
    public String[] addedPersonIds;
    // Post creation datetime in ISO 8601 format
    public String creationTime;
    // Post last modification datetime in ISO 8601 format
    public String lastModifiedTime;

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
}
