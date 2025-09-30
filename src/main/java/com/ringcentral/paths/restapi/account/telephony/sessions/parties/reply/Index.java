package com.ringcentral.paths.restapi.account.telephony.sessions.parties.reply;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallPartyReply;
import com.ringcentral.definitions.ReplyParty;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/reply";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Replies with text/pattern without picking up a call.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/reply
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public ReplyParty post(CallPartyReply callPartyReply) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), callPartyReply, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ReplyParty.class);
    }
}
