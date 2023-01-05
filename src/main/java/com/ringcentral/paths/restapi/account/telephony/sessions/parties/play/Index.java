package com.ringcentral.paths.restapi.account.telephony.sessions.parties.play;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;
public String playId;
public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent, String playId)
      {
this.parent = parent;
this.rc = parent.rc;
this.playId = playId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && playId != null)
            {
                return parent.path() + "/play/" + playId;
            }
            return parent.path() + "/play";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Stop playing audio file into a party
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/play/{playId}
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (playId == null)
    {
        throw new IllegalArgumentException("Parameter playId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.play.pause.Index pause()
  {
    return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.play.pause.Index(this);
  }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.play.resume.Index resume()
  {
    return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.play.resume.Index(this);
  }

}