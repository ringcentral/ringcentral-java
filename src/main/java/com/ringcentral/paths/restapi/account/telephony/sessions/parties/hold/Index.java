package com.ringcentral.paths.restapi.account.telephony.sessions.parties.hold;

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
            return parent.path() + "/hold";
        }
        /**
         * Puts the party to stand-alone mode and starts to play Hold Music according to configuration {@literal &} state to peers. There is a known limitation for Hold API - hold via REST API doesn{@literal '}t work with hold placed via RingCentral apps or HardPhone. It means that if you muted participant via Call Control API and RingCentral Desktop app, then you need to unhold both endpoints to remove Hold Music and bring media back.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/hold
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public CallParty post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}