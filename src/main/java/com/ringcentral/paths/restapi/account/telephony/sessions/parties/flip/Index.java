package com.ringcentral.paths.restapi.account.telephony.sessions.parties.flip;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallPartyFlip;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/flip";
    }

    /**
     * Performs call flip procedure by holding opposite party and calling to the specified target
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/flip
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public String post(CallPartyFlip callPartyFlip) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), callPartyFlip, null);
        return rb.string();
    }
}
