package com.ringcentral.definitions;


public class TMConversationInfo {
    /**
     * Internal identifier of a conversation
     */
    public String id;
    /**
     * Type of conversation
     * Enum: Direct, Personal, Group
     */
    public String type;
    /**
     * Conversation creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Conversation last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     *
     */
    public TMChatMemberInfo[] members;

    public TMConversationInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMConversationInfo type(String type) {
        this.type = type;
        return this;
    }

    public TMConversationInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMConversationInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public TMConversationInfo members(TMChatMemberInfo[] members) {
        this.members = members;
        return this;
    }
}
