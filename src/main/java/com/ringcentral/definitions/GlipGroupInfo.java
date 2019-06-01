package com.ringcentral.definitions;


public class GlipGroupInfo {
    /**
     * Internal identifier of a group
     */
    public String id;
    /**
     * Type of a group. 'PrivateChat' is a group of 2 members. 'Group' is a chat of 2 and more participants, the membership cannot be changed after group creation. 'Team' is a chat of 1 and more participants, the membership can be modified in future. 'PersonalChat' is a private chat thread of a user
     * Enum: PrivateChat, Group, Team, PersonalChat
     */
    public String type;
    /**
     * For 'Team' group type only. Team access level
     */
    public Boolean isPublic;
    /**
     * For 'Team' group type only. Team name
     */
    public String name;
    /**
     * For 'Team' group type only. Team description
     */
    public String description;
    /**
     * Identifier(s) of group members
     */
    public String[] members;
    /**
     * Group creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String creationTime;
    /**
     * Group last change datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     */
    public String lastModifiedTime;

    public GlipGroupInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipGroupInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipGroupInfo isPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public GlipGroupInfo name(String name) {
        this.name = name;
        return this;
    }

    public GlipGroupInfo description(String description) {
        this.description = description;
        return this;
    }

    public GlipGroupInfo members(String[] members) {
        this.members = members;
        return this;
    }

    public GlipGroupInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipGroupInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}
