package com.ringcentral.paths.restapi.account.telephony.sessions.parties.play.pause;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.telephony.sessions.parties.play.Index parent;
public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.play.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/pause";
        }
        /**
         * Pause playing audio file.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/play/{playId}/pause
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public String post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return rb.string();
    }
}