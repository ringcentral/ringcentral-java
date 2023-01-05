package com.ringcentral.paths.teammessaging.teams.add;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.teams.Index parent;
public Index(com.ringcentral.paths.teammessaging.teams.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/add";
        }
        /**
         * Adds members to the specified team.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/teams/{chatId}/add
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public String post(TMAddTeamMembersRequest tMAddTeamMembersRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), tMAddTeamMembersRequest, null);
    return rb.string();
    }
}