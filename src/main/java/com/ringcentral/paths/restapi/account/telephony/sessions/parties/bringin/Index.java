package com.ringcentral.paths.restapi.account.telephony.sessions.parties.bringin;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;
public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/bring-in";
        }
        /**
         * Adds a new party to the call session by bringing-in an established SIP call connection. The maximum number of parties to bring-in is 10; only 1 call party can be added per request. Currently the method is supported for sessions of {@literal '}Conference{@literal '} origin only.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/bring-in
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public CallParty post(AddPartyRequest addPartyRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), addPartyRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}