package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GlipChatInfo {
    /**
     * Internal identifier of a chat
     */
    public String id;
    /**
     * Type of a chat
     * Enum: Everyone, Team, Group, Direct, Personal
     */
    public String type;
    /**
     * For &#039;Team&#039; chat type only. Team access level.
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * For &#039;Team&#039;,&#039;Everyone&#039; chats types only. Chat name.
     */
    public String name;
    /**
     * For &#039;Team&#039;,&#039;Everyone&#039; chats types only. Chat description.
     */
    public String description;
    /**
     * For &#039;Team&#039; chat type only. Team status.
     * Enum: Active, Archived
     */
    public String status;
    /**
     * Chat creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Chat last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     *
     */
    public GlipMemberInfo[] members;

    public GlipChatInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipChatInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipChatInfo _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public GlipChatInfo name(String name) {
        this.name = name;
        return this;
    }

    public GlipChatInfo description(String description) {
        this.description = description;
        return this;
    }

    public GlipChatInfo status(String status) {
        this.status = status;
        return this;
    }

    public GlipChatInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipChatInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipChatInfo members(GlipMemberInfo[] members) {
        this.members = members;
        return this;
    }
}
