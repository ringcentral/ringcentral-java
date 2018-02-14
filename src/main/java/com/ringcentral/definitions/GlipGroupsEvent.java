package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipGroupsEvent
{
    // Internal identifier of a group
    public String id;
    public GlipGroupsEvent id(String id) {
        this.id = id;
        return this;
    }
    // Type of a group. 'PrivateChat' is a group of 2 members. 'Group' is a chat of 2 and more participants, the membership cannot be changed after group creation. 'Team' is a chat of 1 and more participants, the membership can be modified in future. 'PersonalChat' is a private chat thread of a user
    public String type;
    public GlipGroupsEvent type(String type) {
        this.type = type;
        return this;
    }
    // For 'Team' group type only. Team access level
    public Boolean isPublic;
    public GlipGroupsEvent isPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    // For 'Team' group type only. Team name
    public String name;
    public GlipGroupsEvent name(String name) {
        this.name = name;
        return this;
    }
    // For 'Team' group type only. Team description
    public String description;
    public GlipGroupsEvent description(String description) {
        this.description = description;
        return this;
    }
    // Identifier(s) of group members
    public String[] members;
    public GlipGroupsEvent members(String[] members) {
        this.members = members;
        return this;
    }
    // Group creation datetime in ISO 8601 format
    public String creationTime;
    public GlipGroupsEvent creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Group last change datetime in ISO 8601 format
    public String lastModifiedTime;
    public GlipGroupsEvent lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    // Type of a group event. Only the person who joined/was added to a group will receive 'GroupJoined' notification. Only the person who left/was removed from a group will receive 'GroupLeft' notification
    public String eventType;
    public GlipGroupsEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
}
