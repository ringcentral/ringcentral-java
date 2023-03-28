package com.ringcentral.paths.restapi.account.callqueues.bulkassign;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallQueueBulkAssignResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.callqueues.Index parent;

    public Index(com.ringcentral.paths.restapi.account.callqueues.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bulk-assign";
    }

    /**
     * Assigns multiple call queue members to call queue group.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/bulk-assign
     * Rate Limit Group: Heavy
     * App Permission: EditExtensions
     * User Permission: Groups
     */
    public String post(CallQueueBulkAssignResource callQueueBulkAssignResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), callQueueBulkAssignResource, null);
        return rb.string();
    }
}
