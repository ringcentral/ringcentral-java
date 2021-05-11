package com.ringcentral.paths.restapi.glip.teams.remove;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.teams.Index parent;
public Index(com.ringcentral.paths.restapi.glip.teams.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/remove";
        }
        /**
         * Removes members from the specified team. A team is a chat between 2 and more participants assigned with specific name.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/glip/teams/{chatId}/remove
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public String post(GlipPostMembersIdsListBody glipPostMembersIdsListBody) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), glipPostMembersIdsListBody, null);
    return rb.string();
    }
}