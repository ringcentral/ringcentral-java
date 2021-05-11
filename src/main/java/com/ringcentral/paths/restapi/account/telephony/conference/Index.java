package com.ringcentral.paths.restapi.account.telephony.conference;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallSessionObject;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/conference";
    }

    /**
     * Initiates a conference call session.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/conference
     * Rate Limit Group: Heavy
     * App Permission: CallControl
     */
    public CallSessionObject post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallSessionObject.class);
    }
}
