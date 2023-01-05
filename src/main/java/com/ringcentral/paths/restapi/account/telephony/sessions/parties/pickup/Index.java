package com.ringcentral.paths.restapi.account.telephony.sessions.parties.pickup;

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
            return parent.path() + "/pickup";
        }
        /**
         * Picks up a call parked to the specified park location.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/pickup
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public CallParty post(PickupTarget pickupTarget) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), pickupTarget, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}