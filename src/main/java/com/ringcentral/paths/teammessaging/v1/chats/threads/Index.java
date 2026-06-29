package com.ringcentral.paths.teammessaging.v1.chats.threads;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.chats.Index parent;
    public String threadId;

    public Index(com.ringcentral.paths.teammessaging.v1.chats.Index parent, String threadId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.threadId = threadId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && threadId != null) {
            return parent.path() + "/threads/" + threadId;
        }
        return parent.path() + "/threads";
    }

    public String path() {
        return path(true);
    }

    public com.ringcentral.paths.teammessaging.v1.chats.threads.posts.Index posts() {
        return new com.ringcentral.paths.teammessaging.v1.chats.threads.posts.Index(this);
    }
}
