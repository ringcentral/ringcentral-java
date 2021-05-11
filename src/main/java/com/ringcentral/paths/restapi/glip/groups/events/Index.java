package com.ringcentral.paths.restapi.glip.groups.events;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.groups.Index parent;
public Index(com.ringcentral.paths.restapi.glip.groups.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/events";
        }
        /**
         * Returns a list of calendar events available for the current user within the specified group. Users can only see their personal tasks and public tasks.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/glip/groups/{groupId}/events
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipEventInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventInfo.class);
    }

        /**
         * Creates a new calendar event within the specified group.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/glip/groups/{groupId}/events
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipEventInfo post(GlipEventCreate glipEventCreate) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), glipEventCreate, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipEventInfo.class);
    }
}