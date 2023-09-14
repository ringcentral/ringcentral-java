package com.ringcentral.paths.teammessaging.v1.teams.join;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.teams.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.teams.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/join";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Adds the current user to the specified team.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/teams/{chatId}/join
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
