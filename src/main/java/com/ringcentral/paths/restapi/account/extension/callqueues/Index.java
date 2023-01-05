package com.ringcentral.paths.restapi.account.extension.callqueues;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.Index parent;
public Index(com.ringcentral.paths.restapi.account.extension.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/call-queues";
        }
        /**
         * Updates a list of call queues where the user is an agent. This
 * is a full update request, which means that if any call queue where the user is
 * an agent is not mentioned in request, then the user is automatically removed
 * from this queue.
 * 
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/call-queues
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: EditCallQueuePresence
         */
  public UserCallQueues put(UserCallQueues userCallQueues) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.put(this.path(), userCallQueues, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UserCallQueues.class);
    }
}