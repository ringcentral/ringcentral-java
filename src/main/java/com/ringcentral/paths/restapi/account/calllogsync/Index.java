package com.ringcentral.paths.restapi.account.calllogsync;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

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

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Synchronizes company call log records.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-log-sync
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: ReadCallLog
     */
    public CallLogSyncResponse get(SyncAccountCallLogParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallLogSyncResponse.class);
    }

    public CallLogSyncResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
