package com.ringcentral.paths.restapi.account.telephony.sessions.parties.unhold;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallParty;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/unhold";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Brings a party back into a call and stops to play Hold Music. There is a known limitation for Hold API - hold via REST API doesn&#039;t work with hold placed via RingCentral apps or HardPhone. It means that if you muted participant via Call Control API and RingCentral Desktop app, then you need to unhold both endpoints to remove Hold Music and bring media back.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/unhold
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public CallParty post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}
