package com.ringcentral.paths.restapi.account.callqueues.members;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallQueueMembers;
import com.ringcentral.definitions.ListCallQueueMembersParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.callqueues.Index parent;

    public Index(com.ringcentral.paths.restapi.account.callqueues.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/members";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of call queue group members.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/members
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public CallQueueMembers get(ListCallQueueMembersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueueMembers.class);
    }

    public CallQueueMembers get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
