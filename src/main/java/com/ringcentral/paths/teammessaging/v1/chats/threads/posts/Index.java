package com.ringcentral.paths.teammessaging.v1.chats.threads.posts;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.chats.threads.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.chats.threads.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/posts";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of posts from the specified thread in a chat. HTTP Method: get Endpoint:
     * /team-messaging/v1/chats/{chatId}/threads/{threadId}/posts Rate Limit Group: Medium App
     * Permission: TeamMessaging
     */
    public TMPostsList get(ReadGlipThreadPostsNewParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMPostsList.class);
    }

    public TMPostsList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
