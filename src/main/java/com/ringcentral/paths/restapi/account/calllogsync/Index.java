package com.ringcentral.paths.restapi.account.calllogsync;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountCallLogSyncResponse;
import com.ringcentral.definitions.SyncAccountCallLogParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/call-log-sync";
    }

    /**
     * Synchronizes company call log records.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-log-sync
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: ReadCallLog
     */
    public AccountCallLogSyncResponse get(SyncAccountCallLogParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountCallLogSyncResponse.class);
    }

    public AccountCallLogSyncResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
