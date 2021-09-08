package com.ringcentral.paths.restapi.glip.teams.archive;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.teams.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.teams.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/archive";
    }

    /**
     * Changes the status of the specified team to &#039;Archived&#039;. A team is a chat between 2 and more participants assigned with specific name.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/teams/{chatId}/archive
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
