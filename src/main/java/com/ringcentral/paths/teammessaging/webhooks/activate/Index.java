package com.ringcentral.paths.teammessaging.webhooks.activate;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.webhooks.Index parent;
public Index(com.ringcentral.paths.teammessaging.webhooks.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/activate";
        }
        /**
         * Activates a webhook by ID.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/webhooks/{webhookId}/activate
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public String post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return rb.string();
    }
}