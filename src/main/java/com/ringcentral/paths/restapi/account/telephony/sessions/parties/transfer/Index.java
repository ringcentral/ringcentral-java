package com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallParty;
import com.ringcentral.definitions.TransferTarget;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/transfer";
    }

    /**
     * Transfers an answered call to the specified call party. Applicable for a call session in {@literal "}Answered{@literal "} or {@literal "}Hold{@literal "} state.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/transfer
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public CallParty post(TransferTarget transferTarget) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), transferTarget, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}
