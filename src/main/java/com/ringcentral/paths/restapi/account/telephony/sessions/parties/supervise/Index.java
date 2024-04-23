package com.ringcentral.paths.restapi.account.telephony.sessions.parties.supervise;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.PartySuperviseRequest;
import com.ringcentral.definitions.PartySuperviseResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/supervise";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Allows to monitor a call party in &#039;Listen&#039; mode. Input parameters
     * are extension number of a monitored user and internal identifier of a supervisor&#039;s
     * device. Call session and party identifiers should be specified in path. Please
     * note that for this method dual channel audio flow is supported, which means
     * that you need to make one more request for monitoring the second participant
     * of a call. And as a result of each monitoring request the client receives
     * SIP invite with the following header `p-rc-api-monitoring-ids` containing
     * IDs of the monitored party and session. The flow is supported for calls with
     * no more than 2 participants. Currently, this method is supported for Softphone/Hardphone devices
     * only, since device IDs for WebRTC/Mobile apps cannot be obtained.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/supervise
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public PartySuperviseResponse post(PartySuperviseRequest partySuperviseRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), partySuperviseRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PartySuperviseResponse.class);
    }
}
