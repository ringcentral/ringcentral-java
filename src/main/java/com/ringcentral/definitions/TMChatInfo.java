package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class TMChatInfo
{
    /**
     * Internal identifier of a chat
     */
    public String id;
    public TMChatInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of a chat
     * Enum: Everyone, Team, Group, Direct, Personal
     */
    public String type;
    public TMChatInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * For &#039;Team&#039; chat type only. Team access level.
     */
    @SerializedName("public")
    public Boolean _public;
    public TMChatInfo _public(Boolean _public)
    {
        this._public = _public;
        return this;
    }

    /**
     * For &#039;Team&#039;,&#039;Everyone&#039; chats types only. Chat name.
     */
    public String name;
    public TMChatInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * For &#039;Team&#039;,&#039;Everyone&#039; chats types only. Chat description.
     */
    public String description;
    public TMChatInfo description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * For &#039;Team&#039; chat type only. Team status.
     * Enum: Active, Archived
     */
    public String status;
    public TMChatInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Chat creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    public TMChatInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Chat last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMChatInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     */
    public TMChatMemberInfo[] members;
    public TMChatInfo members(TMChatMemberInfo[] members)
    {
        this.members = members;
        return this;
    }
}