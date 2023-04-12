package com.ringcentral.paths.restapi.account.telephony.sessions.parties.move;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.MovePartiesRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/move";
    }

    /**
     * Either moves call parties to RCC Conference by a Secretary or moves call parties to RCV Conference
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/move
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public String post(MovePartiesRequest movePartiesRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), movePartiesRequest, null);
        return rb.string();
    }
}
