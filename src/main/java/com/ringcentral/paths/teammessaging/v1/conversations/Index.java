package com.ringcentral.paths.teammessaging.v1.conversations;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.Index parent;
    public String chatId;

    public Index(com.ringcentral.paths.teammessaging.v1.Index parent, String chatId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.chatId = chatId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && chatId != null) {
            return parent.path() + "/conversations/" + chatId;
        }
        return parent.path() + "/conversations";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of conversations where the user is a member. All records in response are sorted by creation time of a conversation in ascending order. Conversation is a chat of the *Group* type.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/conversations
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMConversationList list(ListGlipConversationsNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMConversationList.class);
    }

    public TMConversationList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new conversation or opens the existing one. If the conversation already exists, then its ID will be returned in response. A conversation is an adhoc discussion between a particular set of users, not featuring any specific name or description; it is a chat of &#039;Group&#039; type. If you add a person to the existing conversation (group), it creates a whole new conversation.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/conversations
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMConversationInfo post(CreateConversationRequest createConversationRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createConversationRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMConversationInfo.class);
    }

    /**
     * Returns information about the specified conversation, including the list of conversation participants. A conversation is an adhoc discussion between a particular set of users, not featuring any specific name or description; it is a chat of &#039;Group&#039; type. If you add a person to the existing conversation, it creates a whole new conversation.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/conversations/{chatId}
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     */
    public TMConversationInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMConversationInfo.class);
    }
}
