package com.ringcentral.definitions;


public class GlipCreateGroup {
    /**
     * Type of a group to be created. &#039;PrivateChat&#039; is a group of 2 members. &#039;Team&#039; is a chat of 1 and more participants, the membership can be modified in future. &#039;PersonalChat&#039; is a private chat thread of a user
     * Required
     * Enum: PrivateChat, Team
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
     * “List of glip members. For &#039;PrivateChat&#039; group type 2 members only are supported”
     */
    public GlipMemberInfo[] members;

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

    public GlipCreateGroup members(GlipMemberInfo[] members) {
        this.members = members;
        return this;
    }
}
