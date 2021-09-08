package com.ringcentral.paths.restapi.glip.teams.leave;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.teams.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.teams.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/leave";
    }

    /**
     * Removes the current user from the specified team. A team is a chat between 2 and more participants assigned with specific name.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/teams/{chatId}/leave
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
