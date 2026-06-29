package com.ringcentral.paths.restapi.account.telephony.callout;

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
        return parent.path() + "/call-out";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates a new CallOut telephony session: an outbound call from the caller described in `from`
     * to the destination in `to`. The caller may be identified with `from.deviceId` or with
     * `from.extensionId` (internal extension / mailbox id); use one or the other, not both. When
     * using `from.deviceId`, only Softphone and Hardphone device instance ids are supported;
     * WebRTC/Mobile clients do not expose usable device ids for this API today. HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/call-out Rate Limit Group:
     * Heavy App Permission: CallControl
     */
    public CallSession post(MakeCallOutRequest makeCallOutRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), makeCallOutRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallSession.class);
    }
}
