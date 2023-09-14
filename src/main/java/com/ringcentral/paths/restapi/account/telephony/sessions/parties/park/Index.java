package com.ringcentral.paths.restapi.account.telephony.sessions.parties.park;

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
        return parent.path() + "/park";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Parks a call to a virtual location from where it can further be retrieved by any user from any phone of the system. The call session and call party identifiers should be specified in path. Currently the users can park only their own incoming calls. Up to 50 calls can be parked simultaneously. Park location starts with asterisk (*) and ranges 801-899.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/park
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public CallParty post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}
