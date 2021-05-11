package com.ringcentral.paths.restapi.account.a2psms.optouts;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.OptOutListResponse;
import com.ringcentral.definitions.ReadA2PSMSOptOutsParameters;

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

    /**
     * Returns the list of numbers opted out from the account. The list can be filtered by `to`/`from` phone number query parameters. Specifying `text/csv` in the Accept header downloads the data in CSV format.
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
}
