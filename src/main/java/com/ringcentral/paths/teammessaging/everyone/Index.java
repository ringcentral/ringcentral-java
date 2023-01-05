package com.ringcentral.paths.teammessaging.everyone;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.Index parent;
public Index(com.ringcentral.paths.teammessaging.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/everyone";
        }
        /**
         * Returns information about &quot;Everyone&quot; chat (a company level chat which includes all employees).
         * HTTP Method: get
         * Endpoint: /team-messaging/{version}/everyone
         * Rate Limit Group: Light
         * App Permission: TeamMessaging
         */
  public EveryoneTeamInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), EveryoneTeamInfo.class);
    }

        /**
         * Updates &quot;Everyone&quot; chat information.
         * HTTP Method: patch
         * Endpoint: /team-messaging/{version}/everyone
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public EveryoneTeamInfo patch(UpdateEveryoneTeamRequest updateEveryoneTeamRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.patch(this.path(), updateEveryoneTeamRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), EveryoneTeamInfo.class);
    }
}