package com.ringcentral.paths.restapi.account.telephony.sessions;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.telephony.Index parent;
public String telephonySessionId;
public Index(com.ringcentral.paths.restapi.account.telephony.Index parent, String telephonySessionId)
      {
this.parent = parent;
this.rc = parent.rc;
this.telephonySessionId = telephonySessionId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && telephonySessionId != null)
            {
                return parent.path() + "/sessions/" + telephonySessionId;
            }
            return parent.path() + "/sessions";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns the status of a call session by ID.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public CallSessionObject get(ReadCallSessionStatusParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    if (telephonySessionId == null)
    {
        throw new IllegalArgumentException("Parameter telephonySessionId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallSessionObject.class);
    }
    public CallSessionObject get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }

        /**
         * Drops a call session.
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (telephonySessionId == null)
    {
        throw new IllegalArgumentException("Parameter telephonySessionId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

  public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parties()
    {
      return this.parties(null);
    }
  public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parties(String partyId)
  {
    return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index(this, partyId);
  }


    public com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index supervise()
  {
    return new com.ringcentral.paths.restapi.account.telephony.sessions.supervise.Index(this);
  }

}