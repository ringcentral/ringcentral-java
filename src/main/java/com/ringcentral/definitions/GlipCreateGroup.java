package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipCreateGroup
{
    // Type of a group to be created. 'PrivateChat' is a group of 2 members. 'Team' is a chat of 1 and more participants, the membership can be modified in future
    public String type;
    public GlipCreateGroup type(String type) {
        this.type = type;
        return this;
    }
    // For 'Team' group type only. Team access level
    public Boolean isPublic;
    public GlipCreateGroup isPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    // For 'Team' group type only. Team name
    public String name;
    public GlipCreateGroup name(String name) {
        this.name = name;
        return this;
    }
    // For 'Team' group type only. Team description
    public String description;
    public GlipCreateGroup description(String description) {
        this.description = description;
        return this;
    }
    // Identifier(s) of group members. For 'PrivateChat' group type 2 members only are supported
    public String[] members;
    public GlipCreateGroup members(String[] members) {
        this.members = members;
        return this;
    }
}
