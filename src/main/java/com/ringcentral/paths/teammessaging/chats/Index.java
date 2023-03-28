package com.ringcentral.paths.teammessaging.chats;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListGlipChatsNewParameters;
import com.ringcentral.definitions.TMChatInfo;
import com.ringcentral.definitions.TMChatList;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;
    public String chatId;

    public Index(com.ringcentral.paths.teammessaging.Index parent, String chatId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.chatId = chatId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && chatId != null) {
            return parent.path() + "/chats/" + chatId;
        }
        return parent.path() + "/chats";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of chats where the user is a member and also public teams that can be joined.
     * <p>
     * All records in response are sorted by creation time of a chat in ascending order.
     * <p>
     * **Chat types**
     * <p>
     * There are multiple types of chats, including:
     * <p>
     * * **Personal** - each user is given a dedicated &quot;personal chat&quot; in which they are the only member.
     * * **Direct** - a chat between two individuals.
     * * **Group** - a chat between three or more named individuals. A &quot;group&quot; chat has no name.
     * * **Team** - a chat related to a specific topic. Members can come and go freely from this chat type.
     * * **Everyone** - a special chat containing every individual in a company.
     * <p>
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/chats
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMChatList list(ListGlipChatsNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMChatList.class);
    }

    public TMChatList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns information about a chat by ID.
     * <p>
     * **Note** &#039;Chat&#039; is a general name for all types of threads including *Personal* (user&#039;s own me-chat), *Direct* (one on one chat), *Group* (chat of 3-15 participants without specific name), *Team* (chat of 2 and more participants, with a specific name), *Everyone* (company chat including all employees, with a specific name).&quot;
     * <p>
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/chats/{chatId}
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     */
    public TMChatInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMChatInfo.class);
    }

    public com.ringcentral.paths.teammessaging.chats.read.Index read() {
        return new com.ringcentral.paths.teammessaging.chats.read.Index(this);
    }


    public com.ringcentral.paths.teammessaging.chats.posts.Index posts() {
        return this.posts(null);
    }

    public com.ringcentral.paths.teammessaging.chats.posts.Index posts(String postId) {
        return new com.ringcentral.paths.teammessaging.chats.posts.Index(this, postId);
    }


    public com.ringcentral.paths.teammessaging.chats.tasks.Index tasks() {
        return new com.ringcentral.paths.teammessaging.chats.tasks.Index(this);
    }


    public com.ringcentral.paths.teammessaging.chats.notes.Index notes() {
        return new com.ringcentral.paths.teammessaging.chats.notes.Index(this);
    }


    public com.ringcentral.paths.teammessaging.chats.unread.Index unread() {
        return new com.ringcentral.paths.teammessaging.chats.unread.Index(this);
    }


    public com.ringcentral.paths.teammessaging.chats.favorite.Index favorite() {
        return new com.ringcentral.paths.teammessaging.chats.favorite.Index(this);
    }


    public com.ringcentral.paths.teammessaging.chats.unfavorite.Index unfavorite() {
        return new com.ringcentral.paths.teammessaging.chats.unfavorite.Index(this);
    }


    public com.ringcentral.paths.teammessaging.chats.adaptivecards.Index adaptiveCards() {
        return new com.ringcentral.paths.teammessaging.chats.adaptivecards.Index(this);
    }

}
