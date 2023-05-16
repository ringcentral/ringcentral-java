package com.ringcentral.paths.teammessaging.v1.everyone;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.EveryoneTeamInfo;
import com.ringcentral.definitions.UpdateEveryoneTeamRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/everyone";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns information about &quot;Everyone&quot; chat (a company level chat which includes all employees).
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/everyone
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     */
    public EveryoneTeamInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EveryoneTeamInfo.class);
    }

    /**
     * Updates &quot;Everyone&quot; chat information.
     * HTTP Method: patch
     * Endpoint: /team-messaging/v1/everyone
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public EveryoneTeamInfo patch(UpdateEveryoneTeamRequest updateEveryoneTeamRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), updateEveryoneTeamRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EveryoneTeamInfo.class);
    }
}
