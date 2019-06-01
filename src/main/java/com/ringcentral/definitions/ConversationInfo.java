package com.ringcentral.definitions;


public class ConversationInfo {
    /**
     * Internal identifier of a conversation
     */
    public String id;
    /**
     * Deprecated. Link to a conversation resource
     */
    public String uri;

    public ConversationInfo id(String id) {
        this.id = id;
        return this;
    }

    public ConversationInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

}
