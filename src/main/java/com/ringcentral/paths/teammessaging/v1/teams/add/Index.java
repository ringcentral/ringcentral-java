package com.ringcentral.paths.teammessaging.v1.teams.add;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.TMAddTeamMembersRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.teams.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.teams.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/add";
    }

    /**
     * Adds members to the specified team.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/teams/{chatId}/add
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post(TMAddTeamMembersRequest tMAddTeamMembersRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), tMAddTeamMembersRequest, null);
        return rb.string();
    }
}
