package com.ringcentral.paths.restapi.account.telephony.sessions.supervise;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SuperviseCallSession;
import com.ringcentral.definitions.SuperviseCallSessionRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/supervise";
    }

    /**
     * Allows to monitor a call session in &#039;Listen&#039; mode. Input parameters should contain internal identifiers of a monitored user and a supervisor&#039;s device. Call session should be specified in path. Please note that this method supports single channel audio flow, which means that audio of both call participants is mixed and delivered to the supervisor in single audio channel. Currently this method is supported for Softphone/Hardphone only, since device IDs for WebRTC/Mobile apps cannot be obtained.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/supervise
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public SuperviseCallSession post(SuperviseCallSessionRequest superviseCallSessionRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), superviseCallSessionRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SuperviseCallSession.class);
    }
}
