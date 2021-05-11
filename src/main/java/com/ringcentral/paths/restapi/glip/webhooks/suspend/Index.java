package com.ringcentral.paths.restapi.glip.webhooks.suspend;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.webhooks.Index parent;
public Index(com.ringcentral.paths.restapi.glip.webhooks.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/suspend";
        }
        /**
         * Suspends a webhook by ID.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/glip/webhooks/{webhookId}/suspend
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public String post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return rb.string();
    }
}