package com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ForwardCallPartyResponse;
import com.ringcentral.definitions.ForwardTarget;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/forward";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Forwards a non-answered incoming call to the specified call party. Applicable for a call session in &quot;Setup&quot; or &quot;Proceeding&quot; state.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/forward
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public ForwardCallPartyResponse post(ForwardTarget forwardTarget) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), forwardTarget, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ForwardCallPartyResponse.class);
    }
}
