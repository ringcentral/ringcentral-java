package com.ringcentral.paths.restapi.account.extension.calllogsync;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallLogSync;
import com.ringcentral.definitions.SyncUserCallLogParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/call-log-sync";
    }

    /**
     * Synchronizes call log records
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-log-sync
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: ReadCallLog
     */
    public CallLogSync get(SyncUserCallLogParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallLogSync.class);
    }

    public CallLogSync get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
