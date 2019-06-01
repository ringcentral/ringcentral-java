package com.ringcentral.definitions;


public class GlipConversationInfo {
    /**
     * Internal identifier of a conversation
     */
    public String id;
    /**
     * Type of a conversation
     * Enum: Direct, Personal, Group
     */
    public String type;
    /**
     * Conversation creation datetime in ISO 8601 format
     */
    public String creationTime;
    /**
     * Conversation last change datetime in ISO 8601 format
     */
    public String lastModifiedTime;
    /**
     *
     */
    public GlipChatMemberInfo[] members;

    public GlipConversationInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipConversationInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipConversationInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipConversationInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipConversationInfo members(GlipChatMemberInfo[] members) {
        this.members = members;
        return this;
    }

}
