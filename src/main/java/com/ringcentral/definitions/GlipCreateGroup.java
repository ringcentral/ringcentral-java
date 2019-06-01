package com.ringcentral.definitions;


public class GlipCreateGroup {
    /**
     * Type of a group to be created. 'PrivateChat' is a group of 2 members. 'Team' is a chat of 1 and more participants, the membership can be modified in future. 'PersonalChat' is a private chat thread of a user
     * Required
     * Enum: PrivateChat, Team
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
     * Identifier(s) of group members. For 'PrivateChat' group type 2 members only are supported
     */
    public String[] members;

    public GlipCreateGroup type(String type) {
        this.type = type;
        return this;
    }

    public GlipCreateGroup isPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public GlipCreateGroup name(String name) {
        this.name = name;
        return this;
    }

    public GlipCreateGroup description(String description) {
        this.description = description;
        return this;
    }

    public GlipCreateGroup members(String[] members) {
        this.members = members;
        return this;
    }

}
