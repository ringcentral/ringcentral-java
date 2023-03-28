package com.ringcentral.paths.teammessaging.teams.archive;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.teams.Index parent;

    public Index(com.ringcentral.paths.teammessaging.teams.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/archive";
    }

    /**
     * Changes the status of the specified team to &#039;Archived&#039;.
     * HTTP Method: post
     * Endpoint: /team-messaging/{version}/teams/{chatId}/archive
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
