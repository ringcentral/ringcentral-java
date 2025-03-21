package com.ringcentral.paths.teammessaging.v1.teams.leave;

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
        return parent.path() + "/leave";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Removes the current user from the specified team.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/teams/{chatId}/leave
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
