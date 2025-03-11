package com.ringcentral.paths.teammessaging.v1.chats.posts;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.chats.Index parent;
    public String postId;

    public Index(com.ringcentral.paths.teammessaging.v1.chats.Index parent, String postId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.postId = postId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && postId != null) {
            return parent.path() + "/posts/" + postId;
        }
        return parent.path() + "/posts";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of posts from the specified chat.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/chats/{chatId}/posts
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMPostsList list(ReadGlipPostsNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMPostsList.class);
    }

    public TMPostsList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a post in the chat specified in path. Any mention can be added within the `text` attribute of
     * the request body in .md format - `![:Type](id)`, where `type` is one of (Person, Team, File, Note,
     * Task, Event, Link, Card) and `id` is a unique identifier of the mentioned object of the specified type.
     * Attachments can also be added to a post by passing the type and ID of attachment(s) in request body.
     * <p>
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/chats/{chatId}/posts
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMPostInfo post(TMCreatePostRequest tMCreatePostRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), tMCreatePostRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMPostInfo.class);
    }

    /**
     * Returns information about the specified post.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/chats/{chatId}/posts/{postId}
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     */
    public TMPostInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (postId == null) {
            throw new IllegalArgumentException("Parameter postId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMPostInfo.class);
    }

    /**
     * Deletes the specified post from the chat.
     * HTTP Method: delete
     * Endpoint: /team-messaging/v1/chats/{chatId}/posts/{postId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (postId == null) {
            throw new IllegalArgumentException("Parameter postId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates a specific post within a chat.
     * HTTP Method: patch
     * Endpoint: /team-messaging/v1/chats/{chatId}/posts/{postId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMPostInfo patch(TMUpdatePostRequest tMUpdatePostRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (postId == null) {
            throw new IllegalArgumentException("Parameter postId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), tMUpdatePostRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMPostInfo.class);
    }
}
