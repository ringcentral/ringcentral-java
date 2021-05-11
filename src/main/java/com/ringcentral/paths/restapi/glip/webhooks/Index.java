package com.ringcentral.paths.restapi.glip.webhooks;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.glip.Index parent;
public String webhookId;
public Index(com.ringcentral.paths.restapi.glip.Index parent, String webhookId)
      {
this.parent = parent;
this.rc = parent.rc;
this.webhookId = webhookId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && webhookId != null)
            {
                return parent.path() + "/webhooks/" + webhookId;
            }
            return parent.path() + "/webhooks";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns the list of all webhooks associated with the current account.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/glip/webhooks
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipWebhookList list() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipWebhookList.class);
    }

        /**
         * Returns webhooks(s) with the specified id(s).
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/glip/webhooks/{webhookId}
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public GlipWebhookList get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (webhookId == null)
    {
        throw new IllegalArgumentException("Parameter webhookId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipWebhookList.class);
    }

        /**
         * Deletes a webhook by ID.
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/glip/webhooks/{webhookId}
         * Rate Limit Group: Medium
         * App Permission: Glip
         * User Permission: Glip
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (webhookId == null)
    {
        throw new IllegalArgumentException("Parameter webhookId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

    public com.ringcentral.paths.restapi.glip.webhooks.suspend.Index suspend()
  {
    return new com.ringcentral.paths.restapi.glip.webhooks.suspend.Index(this);
  }


    public com.ringcentral.paths.restapi.glip.webhooks.activate.Index activate()
  {
    return new com.ringcentral.paths.restapi.glip.webhooks.activate.Index(this);
  }

}