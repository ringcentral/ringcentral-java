package com.ringcentral.paths.restapi.account.telephony.sessions.parties.bridge;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BridgeTargetRequest;
import com.ringcentral.definitions.CallParty;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bridge";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Allows the user to connect multiple call session participants over a conference call bridge.
     * The current active call session ID and party ID of the user within this session should be specified
     * in path; the bridged call session ID and party ID of the user within that session should be specified
     * in request body. Thus, the user connects participants of two sessions into the one conference call
     * using his/her own party IDs from both sessions.&quot;
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/bridge
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public CallParty post(BridgeTargetRequest bridgeTargetRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), bridgeTargetRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}
