package com.ringcentral.paths.restapi.account.callqueues.presence;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.callqueues.Index parent;
public Index(com.ringcentral.paths.restapi.account.callqueues.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/presence";
        }
        /**
         * Returns presence status of the call queue members.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/presence
         * Rate Limit Group: Light
         * App Permission: ReadPresence
         */
  public CallQueuePresence get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueuePresence.class);
    }

        /**
         * Updates presence status of the call queue members in the specified queue.
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-queues/{groupId}/presence
         * Rate Limit Group: Medium
         * App Permission: EditPresence
         */
  public CallQueuePresence put(CallQueueUpdatePresence callQueueUpdatePresence) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.put(this.path(), callQueueUpdatePresence, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueuePresence.class);
    }
}