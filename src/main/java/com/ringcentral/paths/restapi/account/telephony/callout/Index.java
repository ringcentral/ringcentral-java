package com.ringcentral.paths.restapi.account.telephony.callout;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallSession;
import com.ringcentral.definitions.MakeCallOutRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/call-out";
    }

    /**
     * Creates a new outbound call out session. Currently this method is supported for Softphone/Hardphone only, since device IDs for WebRTC/Mobile apps cannot be obtained.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/call-out
     * Rate Limit Group: Heavy
     * App Permission: CallControl
     */
    public CallSession post(MakeCallOutRequest makeCallOutRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), makeCallOutRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallSession.class);
    }
}
