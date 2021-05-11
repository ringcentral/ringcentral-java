package com.ringcentral.paths.restapi.subscription.renew;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.subscription.Index parent;
public Index(com.ringcentral.paths.restapi.subscription.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/renew";
        }
        /**
         * Renews an existent subscription by posting request with an empty body.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/subscription/{subscriptionId}/renew
         * Rate Limit Group: Light
         */
  public SubscriptionInfo post() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionInfo.class);
    }
}