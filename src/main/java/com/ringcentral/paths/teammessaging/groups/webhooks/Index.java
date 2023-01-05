package com.ringcentral.paths.teammessaging.groups.webhooks;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.groups.Index parent;
public Index(com.ringcentral.paths.teammessaging.groups.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/webhooks";
        }
        /**
         * Returns webhooks which are available for the current user by group ID.
         * HTTP Method: get
         * Endpoint: /team-messaging/{version}/groups/{groupId}/webhooks
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public TMWebhookList get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMWebhookList.class);
    }

        /**
         * Creates a new webhook.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/groups/{groupId}/webhooks
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public TMWebhookInfo post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMWebhookInfo.class);
    }
}