package com.ringcentral.paths.restapi.glip.chats.posts;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.chats.Index parent;
public String postId;
public Index(com.ringcentral.paths.restapi.glip.chats.Index parent, String postId)
      {
this.parent = parent;
this.rc = parent.rc;
this.postId = postId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && postId != null)
            {
                return parent.path() + "/posts/" + postId;
            }
            return parent.path() + "/posts";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns a list of posts from the specified chat.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/posts
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipPostsList list(ReadGlipPostsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipPostsList.class);
    }
    public GlipPostsList list() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.list(null);
    }

        /**
         * Creates a post in the chat specified in path. Any mention can be added within the `text` attribute of the request body in .md format - `![:Type](id)`, where `type` is one of (Person, Team, File, Note, Task, Event, Link, Card) and `id` is a unique identifier of the mentioned object of the specified type. Attachments of the following types (File, Card, Event, Note) can also be added to a post by passing type and ID of attachment(s) in request body.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/posts
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipPostInfo post(GlipPostPostBody glipPostPostBody) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(false), glipPostPostBody, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipPostInfo.class);
    }

        /**
         * Returns information about the specified post.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/posts/{postId}
         * Rate Limit Group: Light
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipPostInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (postId == null)
    {
        throw new IllegalArgumentException("Parameter postId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipPostInfo.class);
    }

        /**
         * Deletes the specified post from the chat.
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/posts/{postId}
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (postId == null)
    {
        throw new IllegalArgumentException("Parameter postId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

        /**
         * Updates a specific post within a chat.
         * HTTP Method: patch
         * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/posts/{postId}
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipPostInfo patch(GlipPatchPostBody glipPatchPostBody) throws com.ringcentral.RestException, java.io.IOException
  {
    if (postId == null)
    {
        throw new IllegalArgumentException("Parameter postId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.patch(this.path(), glipPatchPostBody, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipPostInfo.class);
    }
}