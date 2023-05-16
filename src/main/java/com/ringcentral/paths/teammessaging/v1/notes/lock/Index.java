package com.ringcentral.paths.teammessaging.v1.notes.lock;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.notes.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.notes.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/lock";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Locks a note providing the user with the unique write access for 5 hours.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/notes/{noteId}/lock
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
