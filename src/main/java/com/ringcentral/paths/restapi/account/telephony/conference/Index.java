package com.ringcentral.paths.restapi.account.telephony.conference;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/conference";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Initiates a conference call session.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/conference
     * Rate Limit Group: Heavy
     * App Permission: CallControl
     */
    public CallSession post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallSession.class);
    }
}
