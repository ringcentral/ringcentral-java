package com.ringcentral.paths.teammessaging.teams.remove;

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
            return parent.path() + "/remove";
        }
        /**
         * Removes members from the specified team.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/teams/{chatId}/remove
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public String post(TMRemoveTeamMembersRequest tMRemoveTeamMembersRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), tMRemoveTeamMembersRequest, null);
    return rb.string();
    }
}