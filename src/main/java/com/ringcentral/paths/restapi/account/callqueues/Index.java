package com.ringcentral.paths.restapi.account.callqueues;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String groupId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String groupId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.groupId = groupId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && groupId != null) {
            return parent.path() + "/call-queues/" + groupId;
        }
        return parent.path() + "/call-queues";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a call queue list.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-queues
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public CallQueueList list(ListCallQueuesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueueList.class);
    }

    public CallQueueList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns basic information on a call queue group extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public CallQueueDetails get() throws com.ringcentral.RestException, java.io.IOException {
        if (groupId == null) {
            throw new IllegalArgumentException("Parameter groupId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueueDetails.class);
    }

    /**
     * Updates information on a call queue group extension.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}
     * Rate Limit Group: Light
     * App Permission: EditExtensions
     * User Permission: EditUserInfo
     */
    public CallQueueDetails put(CallQueueDetailsForUpdate callQueueDetailsForUpdate) throws com.ringcentral.RestException, java.io.IOException {
        if (groupId == null) {
            throw new IllegalArgumentException("Parameter groupId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), callQueueDetailsForUpdate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueueDetails.class);
    }

    public com.ringcentral.paths.restapi.account.callqueues.members.Index members() {
        return new com.ringcentral.paths.restapi.account.callqueues.members.Index(this);
    }


    public com.ringcentral.paths.restapi.account.callqueues.presence.Index presence() {
        return new com.ringcentral.paths.restapi.account.callqueues.presence.Index(this);
    }


    public com.ringcentral.paths.restapi.account.callqueues.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.callqueues.bulkassign.Index(this);
    }

}
