package com.ringcentral.paths.restapi.account.telephony.sessions.parties.ignore;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/ignore";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Ignores a call to a call queue agent in `Setup` or `Proceeding` state.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/ignore
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public String post(IgnoreRequestBody ignoreRequestBody) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), ignoreRequestBody, null);
        return rb.string();
    }
}
