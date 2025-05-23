package com.ringcentral.paths.restapi.account.calllogextractsync;

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
        return parent.path() + "/call-log-extract-sync";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Extracts all company&#039;s call log records that were updated after the specified time.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-log-extract-sync
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: ReadCallLog
     */
    public CallLogExtractSyncResponse get(ExtractSyncAccountCallLogParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallLogExtractSyncResponse.class);
    }

    public CallLogExtractSyncResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
