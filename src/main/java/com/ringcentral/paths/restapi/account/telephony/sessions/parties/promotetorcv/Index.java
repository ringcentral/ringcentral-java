package com.ringcentral.paths.restapi.account.telephony.sessions.parties.promotetorcv;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/promote-to-rcv";
    }

    /**
     * Creates a new RCV meeting and move parties to it
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/promote-to-rcv
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
