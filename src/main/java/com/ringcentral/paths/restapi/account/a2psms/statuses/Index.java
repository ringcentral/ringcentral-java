package com.ringcentral.paths.restapi.account.a2psms.statuses;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.a2psms.Index parent;

    public Index(com.ringcentral.paths.restapi.account.a2psms.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/statuses";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Retrieves a set of message counts by message status and error codes filtered by dates, batchId and message direction.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/statuses
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public MessageStatusesResponse get(AggregateA2PSMSStatusesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageStatusesResponse.class);
    }

    public MessageStatusesResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
