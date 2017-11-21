package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipGroupInfo
{
    // Internal identifier of a group
    public String id;
    public GlipGroupInfo id(String id) {
        this.id = id;
        return this;
    }
    // Type of a group. 'PrivateChat' is a group of 2 members. 'Group' is a chat of 2 and more participants, the membership cannot be changed after group creation. 'Team' is a chat of 1 and more participants, the membership can be modified in future
    public String type;
    public GlipGroupInfo type(String type) {
        this.type = type;
        return this;
    }
    // For 'Team' group type only. Team access level
    public Boolean isPublic;
    public GlipGroupInfo isPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    // For 'Team' group type only. Team name
    public String name;
    public GlipGroupInfo name(String name) {
        this.name = name;
        return this;
    }
    // For 'Team' group type only. Team description
    public String description;
    public GlipGroupInfo description(String description) {
        this.description = description;
        return this;
    }
    // Identifier(s) of group members
    public String[] members;
    public GlipGroupInfo members(String[] members) {
        this.members = members;
        return this;
    }
    // Group creation datetime in ISO 8601 format
    public String creationTime;
    public GlipGroupInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Group last change datetime in ISO 8601 format
    public String lastModifiedTime;
    public GlipGroupInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
