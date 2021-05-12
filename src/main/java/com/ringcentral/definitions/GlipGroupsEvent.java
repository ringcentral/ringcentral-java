package com.ringcentral.definitions;


public class GlipGroupsEvent {
    /**
     * Internal identifier of a group
     */
    public String id;
    /**
     * Type of a group. &#039;PrivateChat&#039; is a group of 2 members. &#039;Group&#039; is a chat of 2 and more participants, the membership cannot be changed after group creation. &#039;Team&#039; is a chat of 1 and more participants, the membership can be modified in future. &#039;PersonalChat&#039; is a private chat thread of a user
     * Enum: PrivateChat, Group, Team, PersonalChat
     */
    public String type;
    /**
     * For &#039;Team&#039; group type only. Team access level
     */
    public Boolean isPublic;
    /**
     * For &#039;Team&#039; group type only. Team name
     */
    public String name;
    /**
     * For &#039;Team&#039; group type only. Team description
     */
    public String description;
    /**
     * “List of glip members”
     */
    public GlipMemberInfo[] members;
    /**
     * Group creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Group last change datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Type of a group event. Only the person who joined/was added to a group will receive &#039;GroupJoined&#039; notification. Only the person who left/was removed from a group will receive &#039;GroupLeft&#039; notification
     * Enum: GroupRenamed, GroupJoined, GroupLeft, GroupChanged
     */
    public String eventType;

    public GlipGroupsEvent id(String id) {
        this.id = id;
        return this;
    }

    public GlipGroupsEvent type(String type) {
        this.type = type;
        return this;
    }

    public GlipGroupsEvent isPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public GlipGroupsEvent name(String name) {
        this.name = name;
        return this;
    }

    public GlipGroupsEvent description(String description) {
        this.description = description;
        return this;
    }

    public GlipGroupsEvent members(GlipMemberInfo[] members) {
        this.members = members;
        return this;
    }

    public GlipGroupsEvent creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipGroupsEvent lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipGroupsEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
}
