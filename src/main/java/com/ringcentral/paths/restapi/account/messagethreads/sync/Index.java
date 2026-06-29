package com.ringcentral.paths.restapi.account.messagethreads.sync;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagethreads.Index parent;

    public Index(com.ringcentral.paths.restapi.account.messagethreads.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/sync";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Synchronizes the list of message threads. Returns the thread records that the current user
     * can monitor (assigned to current user, assigned to other users or unassigned).
     *
     * <p>In `FSync` mode, only `Open` and `Alive`threads are returned. The records are sorted by
     * `lastModifiedTime` in descending order.
     *
     * <p>HTTP Method: get Endpoint: /restapi/{apiVersion}/account/{accountId}/message-threads/sync
     * Rate Limit Group: Medium App Permission: SMS
     */
    public ThreadSyncList get(MthSyncThreadsParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ThreadSyncList.class);
    }

    public ThreadSyncList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
