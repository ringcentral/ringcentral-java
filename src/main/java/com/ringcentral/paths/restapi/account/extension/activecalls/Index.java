package com.ringcentral.paths.restapi.account.extension.activecalls;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListExtensionActiveCallsParameters;
import com.ringcentral.definitions.UserActiveCallsResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/active-calls";
    }

    /**
     * Returns records of all extension calls that are in progress, ordered by start time in descending order.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/active-calls
     * Rate Limit Group: Heavy
     * App Permission: ReadCallLog
     * User Permission: ReadCallLog
     */
    public UserActiveCallsResponse get(ListExtensionActiveCallsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserActiveCallsResponse.class);
    }

    public UserActiveCallsResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
