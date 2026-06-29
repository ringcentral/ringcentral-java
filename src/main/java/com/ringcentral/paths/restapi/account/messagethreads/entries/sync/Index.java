package com.ringcentral.paths.restapi.account.messagethreads.entries.sync;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagethreads.entries.Index parent;

    public Index(com.ringcentral.paths.restapi.account.messagethreads.entries.Index parent) {
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
     * Synchronizes the list of thread entries. The response may contain: - added or updated
     * messages (full payload); - added or updated notes (full payload); - deleted message entries
     * (limited attributes, `availability` is set to `Deleted`); - deleted note entries (limited
     * attributes, `availability` is set to `Deleted`); - system entries (`action` describes the
     * action performed).
     *
     * <p>In `FSync` model: - only `Alive` messages and notes are returned; - only messages and
     * notes from `Open` threads are returned (unless explicit `threadIds` are requested).
     *
     * <p>The records are sorted by `lastModifiedTime` in descending order.
     *
     * <p>HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/entries/sync Rate Limit Group:
     * Medium App Permission: SMS
     */
    public ThreadEntriesSyncList get(MthSyncEntriesParameters queryParams)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ThreadEntriesSyncList.class);
    }

    public ThreadEntriesSyncList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
