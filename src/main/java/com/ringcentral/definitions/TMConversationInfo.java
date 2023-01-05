package com.ringcentral.definitions;


public class TMConversationInfo
{
    /**
     * Internal identifier of a conversation
     */
    public String id;
    public TMConversationInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of a conversation
     * Enum: Direct, Personal, Group
     */
    public String type;
    public TMConversationInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Conversation creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    public TMConversationInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Conversation last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMConversationInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     */
    public TMChatMemberInfo[] members;
    public TMConversationInfo members(TMChatMemberInfo[] members)
    {
        this.members = members;
        return this;
    }
}