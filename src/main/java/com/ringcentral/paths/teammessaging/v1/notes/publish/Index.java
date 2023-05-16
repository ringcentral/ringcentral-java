package com.ringcentral.paths.teammessaging.v1.notes.publish;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.TMNoteInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.notes.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.notes.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/publish";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Publishes a note making it visible to other users.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/notes/{noteId}/publish
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMNoteInfo post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMNoteInfo.class);
    }
}
