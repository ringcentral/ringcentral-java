package com.ringcentral.paths.restapi.glip.notes.lock;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.notes.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.notes.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/lock";
    }

    /**
     * Locks a note providing the user with the unique write access for 5 hours.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/notes/{noteId}/lock
     * Rate Limit Group: Light
     * App Permission: Glip
     * User Permission: Glip
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
