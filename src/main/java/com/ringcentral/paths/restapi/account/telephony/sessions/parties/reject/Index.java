package com.ringcentral.paths.restapi.account.telephony.sessions.parties.reject;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/reject";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Rejects an inbound call in a &quot;Setup&quot; or &quot;Proceeding&quot; state
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reject
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
