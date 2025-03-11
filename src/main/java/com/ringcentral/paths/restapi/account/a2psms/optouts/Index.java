package com.ringcentral.paths.restapi.account.a2psms.optouts;

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
        return parent.path() + "/opt-outs";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of numbers opted out from the account. The list
     * can be filtered by `to`/`from` phone number query parameters. Specifying `text/csv`
     * in the `Accept` header lets download the data in the CSV format.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/opt-outs
     * Rate Limit Group: Light
     * App Permission: A2PSMS
     */
    public OptOutListResponse get(ReadA2PSMSOptOutsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), OptOutListResponse.class);
    }

    public OptOutListResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    public com.ringcentral.paths.restapi.account.a2psms.optouts.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.a2psms.optouts.bulkassign.Index(this);
    }

}
